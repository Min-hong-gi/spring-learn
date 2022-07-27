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

    <body class="bg-gradient-primary d-flex align-items-center justify-content-center" style="height: 100vh !important;">

        <div class="container">

            <!-- Outer Row -->
            <div class="row justify-content-center">

                <div class="col-xl-10 col-lg-8 col-md-9">

                    <div class="card o-hidden border-0 shadow-lg my-5">
                        <div class="card-body p-0">
                            <!-- Nested Row within Card Body -->
                            <div class="row justify-content-center">
                                <div class="col-lg-10">
                                    <div class="p-5">
                                        <div class="text-center">
                                            <h1 class="h4 text-gray-900 mb-4">Login</h1>
                                        </div>
                                        <form class="user" action="" method="POST">
                                            <div class="form-group">
                                                <input type="text" class="form-control form-control-user" id="id"
                                                    placeholder="id" name="user_id">
                                            </div>
                                            <div class="form-group">
                                                <input type="password" class="form-control form-control-user"
                                                    id="password" placeholder="Password" name="password">
                                            </div>
                                            <div class="form-group">
                                                <input type="text" class="form-control form-control-user"
                                                    id="name" placeholder="name" name="name">
                                            </div>
                                            <button class="btn btn-primary btn-user btn-block">
                                                <span class="text">
                                                    Regist
                                                </span>
                                            </button>
                                        </form>
                                        <hr>
                                        <div class="text-center">
                                            <a class="small" href="/login">이미 계정이 있으신가요?</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

            </div>

        </div>

        <%@ include file="/master/bootstrap-core.jsp" %>
    </body>

    </html>