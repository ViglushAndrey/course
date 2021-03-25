<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>
<body>
<h1>Hello Officer </h1>
<div style="width: 800px; margin-left: auto; margin-right: auto" >
    <table class="table table-dark table-striped">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>bDay</th>
            <th>Speciality</th>
            <th>DateOfAssignmentOfAnOfficerRank</th>
            <th>Awards</th>
            <th>OfficersRanks</th>
            <th>Delete</th>

        </tr>
        <#list officers as officer>
            <tr>

                <td>${officer.id}</td>
                <td>${officer.name}</td>
                <td>${officer.bDay}</td>
                <td>${officer.speciality}</td>
                <td>${officer.dateOfAssignmentOfAnOfficerRank}</td>
                <td>${officer.awards}</td>
                <td>${officer.officersRanks}</td>
                <td><a href="/ui/Officers/delete/${officer.id}"><button class="btn btn-outline-dark">Del</button></a></td>

            </tr>
        </#list>
    </table>
</div>


</body>
</html>