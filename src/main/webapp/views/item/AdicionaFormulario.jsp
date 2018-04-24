<%@	taglib	uri="http://www.springframework.org/tags/form"	prefix="form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<c:import url = "../layout/header.jsp"/>

<a	href="ListaItens">Mostrar Itens</a>

	<form:errors path="item.nome" cssStyle="color:red"/>
	<form action="AdicionaItem" method="post">
		<p>
			Nome: <input type="text" name="nome"/>
		</p>
		<p>
			Descrição:<textarea name="descricao" rows="10" cols="30"></textarea>
		</p>

		<p>
			Preço: <input type="text" name="valor"/>
		</p>

		<p>
			Tipo do Item: <select name="tipo">
				<option value="Roupa">Roupa</option>
				<option value="Bijouteria">Bijouteria</option>
			</select>

		</p>

		<br /> <input type="submit" value="Adicionar">
	</form>

<c:import url = "../layout/footer.jsp"/>