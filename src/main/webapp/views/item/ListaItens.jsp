<%@	taglib	uri="http://java.sun.com/jsp/jstl/core"	prefix="c" %>
<%@	taglib	uri="http://java.sun.com/jsp/jstl/fmt"	prefix="fmt" %>

<c:import url = "../layout/header.jsp"/>

<a	href="AdicionaFormulario">Inserir novo item</a>

<br><br>

	<table>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Descrição</th>
			<th>Preço Unitário</th>
			<th>Tipo</th>
			<th>Alterar</th>
			<th>Excluir</th>
		</tr>
		<c:forEach items="${itens}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.nome}</td>
				<td>${item.descricao}</td>
				<td><fmt:formatNumber value = "${item.valor}" type = "currency"/></td>
				<td>${item.tipo}</td>
				<td><a href="MostraItem?id=${item.id}">[Alterar]</a></td>
				<td><a href="RemoveItem?id=${item.id}">[Excluir]</a></td>
			</tr>
		</c:forEach>
	</table>

<c:import url = "../layout/footer.jsp"/>