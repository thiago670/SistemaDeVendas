<%@	taglib	uri="http://www.springframework.org/tags/form"	prefix="form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sistema de Vendas</title>
<script type="text/javascript" src="resources/js/jquery.js"></script>
<script language="javascript" type="text/javascript">

	$(document).ready(function() {
		$('#total').html(0);
		$('.idVenda').keypress(function(e) {
			if (e.which == 13) {
				var id = $(this).val();
				$.ajax({
					type : 'GET',
					url : 'AjaxRetornaItem?id=' + id,
					dataType : 'json',
					success : function(result) {

						var nome = result['nome'];
						var descricao = result['descricao'];
						var valor = parseFloat(result['valor']) || 0
						
						console.log("Nome->"+nome);
						$(this).find('td').css( "background-color", "red" );
// 						$(this).closest('td').next().find('input').val(nome)
						
// 						$('#nome').val(nome);
						$('#descricao').val(descricao);
						$('#valor').val(valor);

						var total = $('#total').val() + valor;
						$('#total').html(total);
					},
					error : function(xhr, ajaxOptions, thrownError) {
						alert('Item não encontrado!');
					}
				});
			}
		});
	});
</script>

</head>

<c:import url="../layout/header.jsp" />

<form:errors path="item.nome" cssStyle="color:red" />
<form action="Vende" method="post">
	<table border=1>
		<thead>
			<tr>
				<th>Nº</th>
				<th>Código</th>
				<th>Nome</th>
				<th>Descrição</th>
				<th>Valor</th>
			</tr>
		</thead>
		<tbody>
			<tr id=1>
				<td>1</td>
				<td><input type="text" id="id" class="idVenda"></td>
				<td><input type="text" id="nome" disabled></td>
				<td><input type="text" id="descricao" disabled></td>
				<td><input type="text" id="valor" disabled></td>
			</tr>
			<tr id=2>
				<td>2</td>
				<td><input type="text" id="id" class="idVenda"></td>
				<td><input type="text" id="nome" disabled></td>
				<td><input type="text" id="descricao" disabled></td>
				<td><input type="text" id="valor" disabled></td>
			</tr>
			<tr id=3>
				<td>3</td>
				<td><input type="text" id="id" class="idVenda"></td>
				<td><input type="text" id="nome" disabled></td>
				<td><input type="text" id="descricao" disabled></td>
				<td><input type="text" id="valor" disabled></td>
			</tr>

			<tr id=4>
				<td>4</td>
				<td><input type="text" id="id" class="idVenda"></td>
				<td><input type="text" id="nome" disabled></td>
				<td><input type="text" id="descricao" disabled></td>
				<td><input type="text" id="valor" disabled></td>
			</tr>
			<tr>
				<td colspan=5 style="font-size: 40px;"><p align="right"><span id="total"></span></p></td>
			</tr>
		</tbody>
	</table>
	<br /> <input type="button" value="Finalizar Venda">
</form>
<c:import url="../layout/footer.jsp" />