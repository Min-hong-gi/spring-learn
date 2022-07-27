package net.openobject.dashboard.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.openobject.dashboard.dao.BoardRepo;
import net.openobject.dashboard.dto.Board;
import net.openobject.dashboard.dto.User;

@Controller
public class BoardController {

    @Autowired
    BoardRepo boardRepo;

    @GetMapping(value = "/board")
    public String getMethodName(HttpServletRequest request, Model model) {
        try {
            List<Board> boards = boardRepo.getBoards();
            model.addAttribute("boards", boards);
        } catch (Exception e) {
            model.addAttribute("msg", "서버 오류입니다.");
            return "error";
        }
        return "home";
    }

    @GetMapping(value = "/board/{id}")
    public String getBoard(@PathVariable("id") int id, Model model) {
        try {
            model.addAttribute("board", boardRepo.getBoard(id));
        } catch (Exception e) {
            model.addAttribute("msg", "서버 오류입니다.");
            return "error";
        }
        return "board/detail";
    }

    @GetMapping("/board/new")
    public String createBoardPage(HttpServletRequest req, Model model) {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "login";
        }
        return "board/create";
    }

    @PostMapping(value = "/board/new")
    public String createBoard(HttpServletRequest req, Board board, Model model) {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "login";
        }
        board.setManager_id(user.getId());
        try {
            boardRepo.createBoard(board);
        } catch (Exception e) {
            model.addAttribute("msg", "서버 오류입니다.");
            return "error";
        }
        return "redirect:/board";
    }

    @GetMapping("/board/update/{board_id}")
    public String updateBoardPage(HttpServletRequest req, @PathVariable("board_id") int id, Model model) {
        try {
            Board board = boardRepo.getBoard(id);
            if (board == null) {
                model.addAttribute("msg", "해당 게시판이 존재하지 않습니다.");
                return "error";
            }
            HttpSession session = req.getSession();
            User user = (User) session.getAttribute("user");
            if (board.getManager_id() != user.getId()) {
                model.addAttribute("msg", "권한이 없습니다.");
                return "error";
            }
            model.addAttribute("board", board);
        } catch (Exception e) {
            model.addAttribute("msg", "조회 중 오류 발생");
            return "error";
        }
        return "board/update";
    }

    @PostMapping("/board/update/{board_id}")
    public String updateBoard(HttpServletRequest req, Board boardData,
            @PathVariable("board_id") int board_id, Model model) {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        try {
            if (boardRepo.getBoard(board_id).getManager_id() != user.getId()) {
                model.addAttribute("msg", "권한이 없습니다.");
                return "error";
            }
            boardData.setId(board_id);
            boardData.setManager_id(user.getId());
            boardRepo.updateBoard(boardData);
        } catch (Exception e) {
            model.addAttribute("msg", "서버 오류입니다.");
            return "error";
        }
        return "redirect:/board";
    }

    @GetMapping("/board/delete/{board_id}")
    public String deleteBoard(HttpServletRequest req, @PathVariable("board_id") int board_id, Model model) {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        try {
            if (boardRepo.getBoard(board_id).getManager_id() != user.getId()) {
                model.addAttribute("msg", "권한이 없습니다.");
                return "error";
            }
            boardRepo.deleteBoard(board_id);
        } catch (Exception e) {
            model.addAttribute("msg", "서버 오류입니다.");
            return "error";
        }
        return "redirect:/board";
    }

}