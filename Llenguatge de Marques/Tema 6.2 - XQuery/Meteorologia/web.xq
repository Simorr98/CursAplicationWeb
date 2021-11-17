<html lang="ca">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <link rel="stylesheet" href="css.css"/>
    <title>Web de Meteorologia</title>
</head>
<body>
    <p>Provincia: 
    {
    let $provincia := doc("weather.xml")//provincia
    return
        data($provincia)
    }
    </p>
    <p>Nombre:
    {
    let $nom := doc("weather.xml")//nombre
    return
        data($nom)
    }
    </p>
    <div>    
        <table style="text-align: center" border="1">
            <tr bgcolor="blue">
                <th style="text-align:left">Data</th>
                <th style="text-align:left">Temperatura Maxima</th>
                <th style="text-align:left">Temperatura Minima</th>
                <th style="text-align:left">Icono</th>
            </tr>
                    {          
                     for $data in doc("weather.xml")/root/prediccion/dia
                     return
                     if($data/estado_cielo > 11)
                     then
                      <tr>
                       <td>{data($data/@fecha)}</td>
                       <td>{data($data/temperatura/maxima)}</td>
                       <td>{data($data/temperatura/minima)}</td>
                       <td><img src="nube.png"/></td>
                      </tr> 
                     else
                      <tr>
                       <td>{data($data/@fecha)}</td>
                       <td>{data($data/temperatura/maxima)}</td>
                       <td>{data($data/temperatura/minima)}</td>
                       <td><img src="sol.png"/></td>
                      </tr>             
                    }                                                                 
        </table>
    </div>
</body>
</html>