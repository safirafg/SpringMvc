<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Adicionar Novo Funcion�rio</h1>
<form:form method="post" action="save">
	<table>
		<tr>
			<td>Nome :</td>
			<td><form:input path="nome" /></td>
		</tr>
		<tr>
			<td>Sal�rio :</td>
			<td><form:input path="salario" /></td>
		</tr>
		<tr>
			<td>Designa��o :</td>
			<td><form:input path="designacao" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Salvar" /></td>
		</tr>
	</table>
</form:form>
