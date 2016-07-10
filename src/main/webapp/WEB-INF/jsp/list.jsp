<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Tag List</title>
    <%@include file="common/head.jsp" %>
  </head>
  <body>
    <div class="container">
    	<div class="panel panel-default">
    		<div class="panel-heading text-center">
    			<h2>Tag列表</h2>
    		</div>
    		<div class="panel-body">
    			<table class="table table-hover">
    				<thead>
    					<tr>
    						<th>uid</th>
    						<th>tag</th>
    						<th>opt</th>
    					</tr>
    				</thead>
    				<tbody>
    					<!-- 通过标签循环，通过EL表达式获取Model值 -->
    					<c:forEach var="tag" items="${list}">
    						<tr>
    							<td>${tag.uid}</td>
    							<td>${tag.tag}</td>
    							<td><a class="btn btn-info" href="#">ok</a></td>
    						</tr>
    					</c:forEach>
    				</tbody>
    			</table>
    		</div>
    	</div>
    </div>

	
    <!-- jQuery (必须用c:url引入js) -->
    <script type="text/javascript" src='<c:url value="/js/jquery.min.js"></c:url>'></script>
    <!-- bootstrap js (必须用c:url引入js)  -->
    <script type="text/javascript" src='<c:url value="/js/bootstrap.min.js"></c:url>'></script>
  </body>
</html>