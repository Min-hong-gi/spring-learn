<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="net.openobject.dashboard.dto.Board" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
	<title>Dashboard</title>
	<!-- Custom fonts for this template-->
	<link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
	<link
		href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
		rel="stylesheet">
	<!-- Custom styles for this template-->
	<link href="/resources/css/sb-admin-2.min.css" rel="stylesheet">
</head>
<body id="page-top">
	<!-- Page Wrapper -->
	<div id="wrapper">
		<%@ include file="/master/slider.jsp" %>
		<div id="content-wrapper" class="d-flex flex-column">
			<!-- Main Content -->
			<div id="content">
				<%@ include file="/master/header.jsp" %>
				<!-- Begin Page Content -->
				<div class="container-fluid">
					<!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800">게시판</h1>
                    </div>
					<div class="d-flex flex-row-reverse mb-3">
						<a href="/board/new" class="btn btn-success btn-icon-split col-auto">
							<span class="text">생성</span>
						</a>
					</div>
                    <div class="row">
						<% 
                		List<Board> boards = (List<Board>) request.getAttribute("boards");
                		for(Board board: boards){ %>
                        <!-- Earnings (Monthly) Card Example -->
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div class="card border-left-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <a href="/board/<%=board.getId()%>" class="col mr-2">
                                            <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">
												<%= board.getId() %>
                                            </div>
                                            <div class="h5 mb-0 font-weight-bold text-gray-800"><%= board.getName() %></div>
                                        </a>
                                        <div class="row-auto d-flex flex-column">
                                            <a class="col-auto btn btn-warning" href="/board/update/<%= board.getId() %>">
												<span class="text">수정</span>
											</a>
											<a class="col-auto btn btn-danger" href="/board/delete/<%= board.getId() %>">
												<span class="text">삭제</span>
											</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
						<% } %>
					</div>
				</div>
				<!-- /.container-fluid -->
			</div>
			<!-- End of Main Content -->
			<%@ include file="/master/footer.jsp" %>
		</div>
	</div>
	<%@ include file="/master/scrollButton.jsp" %>
	<%@ include file="/master/logoutModal.jsp" %>
	<%@ include file="/master/bootstrap-core.jsp" %>
</body>
</html>