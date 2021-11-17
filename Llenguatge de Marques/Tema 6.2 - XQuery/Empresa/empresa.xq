<html lang="ca">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous" />
    <link rel="stylesheet" href="css.css"/>
    <title>Empreses</title>
</head>

<body>
        <h1 class="margin" style="text-align: center">Empleats per departament</h1>
        <div class="accordion accordion-flush enmig" id="accordionFlushExample">
        <div class="accordion-item enmig">
            <h2 class="accordion-header" id="flush-headingOne">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
                    HHRR Department
                </button>
            </h2>
            <div id="flush-collapseOne" class="accordion-collapse collapse" aria-labelledby="flush-headingOne" data-bs-parent="#accordionFlushExample">
                <div class="accordion-body">
                    <table style="text-align: center" width="100%">
                    <tr>
                      <th class="left">ID</th>
                      <th>NAME</th>
                      <th>SALARY</th>
                      <th>GENDER</th>
                    </tr>
                     {          
                     for $departament in doc("company.xml")/company/employee
                     where $departament/department = "HHRR"
                     order by xs:integer($departament/salary) descending
                     return
                     if($departament/salary > 150000)               
                     then
                      <tr style="background-color: cyan">
                       <td class="left">{data($departament/id)}</td>
                       <td>{data($departament/name)}</td>
                       <td>{data($departament/salary)}</td>
                       <td>{data($departament/gender)}</td>
                      </tr>
                     else
                     <tr>
                       <td class="left">{data($departament/id)}</td>
                       <td>{data($departament/name)}</td>
                       <td>{data($departament/salary)}</td>
                       <td>{data($departament/gender)}</td>
                      </tr>                               
                    }
                    </table>
                </div>
            </div>
        </div>
        <div class="accordion-item enmig">
            <h2 class="accordion-header" id="flush-headingTwo">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo" aria-expanded="false" aria-controls="flush-collapseTwo">
                    Sales department
                </button>
            </h2>
            <div id="flush-collapseTwo" class="accordion-collapse collapse" aria-labelledby="flush-headingTwo" data-bs-parent="#accordionFlushExample">
                <div class="accordion-body">
                 <table style="text-align: center" width="100%">
                    <tr>
                      <th class="left">ID</th>
                      <th>NAME</th>
                      <th>SALARY</th>
                      <th>GENDER</th>
                    </tr>
                     {          
                     for $departament in doc("company.xml")/company/employee
                     where $departament/department = "Sales"
                     order by xs:integer($departament/salary) descending
                     return
                     if($departament/salary > 150000)               
                     then
                      <tr style="background-color: cyan">
                       <td class="left">{data($departament/id)}</td>
                       <td>{data($departament/name)}</td>
                       <td>{data($departament/salary)}</td>
                       <td>{data($departament/gender)}</td>
                      </tr>
                     else
                     <tr>
                       <td class="left">{data($departament/id)}</td>
                       <td>{data($departament/name)}</td>
                       <td>{data($departament/salary)}</td>
                       <td>{data($departament/gender)}</td>
                      </tr>                               
                    }
                    </table>
                </div>
            </div>
        </div>
        <div class="accordion-item enmig">
            <h2 class="accordion-header" id="flush-headingThree">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseThree" aria-expanded="false" aria-controls="flush-collapseThree">
                    Direction department
                </button>
            </h2>
            <div id="flush-collapseThree" class="accordion-collapse collapse" aria-labelledby="flush-headingThree" data-bs-parent="#accordionFlushExample">
                <div class="accordion-body">
                  <table style="text-align: center" width="100%">
                    <tr>
                      <th class="left">ID</th>
                      <th>NAME</th>
                      <th>SALARY</th>
                      <th>GENDER</th>
                    </tr>
                     {          
                     for $departament in doc("company.xml")/company/employee
                     where $departament/department = "Direction"
                     order by xs:integer($departament/salary) descending
                     return
                     if($departament/salary > 150000)               
                     then
                      <tr style="background-color: cyan">
                       <td class="left">{data($departament/id)}</td>
                       <td>{data($departament/name)}</td>
                       <td>{data($departament/salary)}</td>
                       <td>{data($departament/gender)}</td>
                      </tr>
                     else
                     <tr>
                       <td class="left">{data($departament/id)}</td>
                       <td>{data($departament/name)}</td>
                       <td>{data($departament/salary)}</td>
                       <td>{data($departament/gender)}</td>
                      </tr>                               
                    }
                    </table>
                </div>
            </div>
        </div>
        <div class="accordion-item enmig">
            <h2 class="accordion-header" id="flush-headingFour">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseFour" aria-expanded="false" aria-controls="flush-collapseFour">
                    Accounting department
                </button>
            </h2>
            <div id="flush-collapseFour" class="accordion-collapse collapse" aria-labelledby="flush-headingFour" data-bs-parent="#accordionFlushExample">
                <div class="accordion-body">
                  <table style="text-align: center" width="100%">
                    <tr>
                      <th class="left">ID</th>
                      <th>NAME</th>
                      <th>SALARY</th>
                      <th>GENDER</th>
                    </tr>
                     {          
                     for $departament in doc("company.xml")/company/employee
                     where $departament/department = "Accounting"
                     order by xs:integer($departament/salary) descending
                     return
                     if($departament/salary > 150000)               
                     then
                      <tr style="background-color: cyan">
                       <td class="left">{data($departament/id)}</td>
                       <td>{data($departament/name)}</td>
                       <td>{data($departament/salary)}</td>
                       <td>{data($departament/gender)}</td>
                      </tr>
                     else
                     <tr>
                       <td class="left">{data($departament/id)}</td>
                       <td>{data($departament/name)}</td>
                       <td>{data($departament/salary)}</td>
                       <td>{data($departament/gender)}</td>
                      </tr>                               
                    }
                    </table>
                </div>
            </div>
        </div>
        <div class="accordion-item enmig">
            <h2 class="accordion-header" id="flush-headingFive">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseFive" aria-expanded="false" aria-controls="flush-collapseFive">
                    Development department
                </button>
            </h2>
            <div id="flush-collapseFive" class="accordion-collapse collapse" aria-labelledby="flush-headingFive" data-bs-parent="#accordionFlushExample">
                <div class="accordion-body">
                  <table style="text-align: center" width="100%">
                    <tr>
                      <th class="left">ID</th>
                      <th>NAME</th>
                      <th>SALARY</th>
                      <th>GENDER</th>
                    </tr>
                     {          
                     for $departament in doc("company.xml")/company/employee
                     where $departament/department = "Development"
                     order by xs:integer($departament/salary) descending
                     return
                     if($departament/salary > 150000)               
                     then
                      <tr style="background-color: cyan">
                       <td class="left">{data($departament/id)}</td>
                       <td>{data($departament/name)}</td>
                       <td>{data($departament/salary)}</td>
                       <td>{data($departament/gender)}</td>
                      </tr>
                     else
                     <tr>
                       <td class="left">{data($departament/id)}</td>
                       <td>{data($departament/name)}</td>
                       <td>{data($departament/salary)}</td>
                       <td>{data($departament/gender)}</td>
                      </tr>                               
                    }
                    </table>
                </div>
            </div>
        </div>
    </div>

    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous">
        //comentari necessari per evitar error de procés XQUERY

    </script>
</body>

</html>
