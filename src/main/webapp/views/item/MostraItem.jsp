<%@	taglib	uri="http://www.springframework.org/tags/form"	prefix="form"	%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url = "../layout/header.jsp"/>

<form:errors path="item.nome" cssStyle="color:red"/>
	<form action="AtualizaItem" method="post">
		<input type="hidden" name="id" value="${item.id}">
		
		<p>
			Nome: <input type="text" name="nome" value="${item.nome}"/>
		</p>
		<p>
			Descrição:<textarea name="descricao" rows="10" cols="30" >${item.descricao}</textarea>
		</p>

		<p>
			Preço: <input type="text" name="valor" value="${item.valor}"/>
		</p>

		<p>
			Tipo do Item: <select name="tipo">
				<c:choose>
				
					<c:when test="${item.tipo=='Roupa'}">
						<option value="Roupa" selected>Roupa</option>
						<option value="Bijouteria">Bijouteria</option>
					</c:when>
					
					<c:when test="${item.tipo=='Bijouteria'}">
						<option value="Roupa">Roupa</option>
						<option value="Bijouteria" selected>Bijouteria</option>
					</c:when>
				
				</c:choose>
			
			</select>

		</p>

		<br /> <input type="submit" value="Atualizar">
	</form>

<c:import url = "../layout/header.jsp"/>