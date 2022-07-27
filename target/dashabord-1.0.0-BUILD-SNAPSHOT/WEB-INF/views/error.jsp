<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>

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
                                <!-- 404 Error Text -->
                                <div class="text-center">
                                    <div class="error mx-auto w-50" data-text="ERROR!">ERROR!</div>
                                    <p class="lead text-gray-800 mb-5">${msg}</p>
                                    <a href="/">&larr; Back to Dashboard</a>
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