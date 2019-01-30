<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<center>
		<spring:form modelAttribute="prd" action="addproductcontroller">
			<div class="form-group">
				<label for="name">Name</label>
				<spring:input path="price"/>
			</div>
			<div class="form-group">
				<label for="name">Price</label>
				<spring:input path="name" class="form-control"/>
			</div>
			<div class="form-group">
				<label for="name">Model</label>
				<spring:input path="producttype.productmodel"/>
			</div>
			<div class="form-group">
				<label for="name">Color</label>
				<spring:checkbox path="producttype.colors" value="red"/>Red
				<spring:checkbox path="producttype.colors" value="green"/>Green
				<spring:checkbox path="producttype.colors" value="yellow"/>Yellow
			</div>
			
			< input type="submit" value="Save" />
				
		</spring:form>		
	</center>
</body>
</html>
