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
                            <div class="container-fluid h-75">
                                <!-- Page Heading -->
                                <!-- 404 Error Text -->
                                <div class="row mb-3 h-100">

                                    <!-- Grow In Utility -->
                                    <div class="col-lg-12">

                                        <div class="card position-relative h-100">
                                            <div class="card-header py-3">
                                                <h6 class="m-0 font-weight-bold text-primary">
                                                    ${board.name}
                                                </h6>
                                            </div>
                                            <div class="card-body h-100">
                                                <p>
                                                    ${board.description}
                                                </p>
                                            </div>
                                        </div>

                                    </div>
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