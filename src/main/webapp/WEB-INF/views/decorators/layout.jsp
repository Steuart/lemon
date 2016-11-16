<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>
        <sitemesh:write property='title' />
    </title>
    <sitemesh:write property='head' />
</head>
<body>
    <h1>模板</h1>
    <sitemesh:write property='body' />
</body>
</html>