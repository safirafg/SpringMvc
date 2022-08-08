<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Lista de funcionários</h1>
<table border="2" width="70%" cellpadding="2">

	<tr>
		<th>Id</th>
		<th>Nome</th>
		<th>Salário</th>
		<th>Designação</th>
		<th>Editar</th>
		<th>Deletar</th>

	</tr>
	<c:forEach var="emp" items="${list}">
		<tr>
			<td>${emp.id}</td>
			<td>${emp.nome}</td>
			<td>${emp.salario}</td>
			<td>${emp.designacao}</td>
			<td><a href="editemp/${emp.id}">Edit</a></td>
			<td><a href="deleteemp/${emp.id}">Delete</a></td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="index">Home</a>
<a href="empform">Adicionar Novo Funcionário</a>
