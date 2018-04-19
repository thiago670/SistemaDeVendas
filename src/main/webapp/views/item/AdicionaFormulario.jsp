<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@	taglib	uri="http://www.springframework.org/tags/form"	prefix="form"	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:errors path="item.nome" cssStyle="color:red"/>
	<form action="AdicionaItem" method="post">
		<p>
			Nome: <input type="text" name="nome"/>
		</p>
		<p>
			Descrição:<textarea name="descricao" rows="10" cols="30"></textarea>
		</p>

		<p>
			Preço Unitário: <input type="text" name="precoUnitario"/>
		</p>

		<p>
			Tipo do Item: <select name="tipo">
				<option value="Roupa">Roupa</option>
				<option value="Bijouteria">Bijouteria</option>
			</select>

		</p>

		<br /> <input type="submit" value="Adicionar">
	</form>

</body>
</html>