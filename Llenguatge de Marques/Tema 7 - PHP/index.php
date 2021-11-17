<!doctype html>
<html lang="ca">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

    <title>Hotels</title>
</head>
<body>
    <div class="container">
        <h2>Llista hotels</h2>
        <table class="table">
        <tr>
            <th>Id</th>
            <th>Nom</th>
            <th>Categoria</th>
            <th>Places</th>
        </tr>

<?php
require_once 'connexio.php';

/**
 * @var mysqli $connexio
 */

$consulta = "SELECT * from hotel";

if ($resultat = $connexio->query($consulta)) {

    /* obtenim els resultats en un array associatiu*/
    while ($hotel = $resultat->fetch_assoc()) {
        echo '<tr>';
            echo '<td>'.$hotel["id"].'</td>';
            echo '<td>'.$hotel["nom"].'</td>';
            echo '<td>'.$hotel["categoria"].'</td>';
            echo '<td>'.$hotel["places"].'</td>';
        echo '</tr>';
    }

    /* alliberem la variable que conté els resultats */
    $resultat->free();
}
?>

</table>
</div>


<!-- Optional JavaScript; choose one of the two! -->

<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

<!-- Option 2: Separate Popper and Bootstrap JS -->
<!--
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
-->
</body>
</html>

<?php
require_once 'tancar_connexio.php';
?>
