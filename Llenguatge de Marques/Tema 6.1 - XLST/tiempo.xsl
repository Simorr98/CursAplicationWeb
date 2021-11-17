<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
    <style>
        img{
            widht: 20%;
            height: 60px;
        }
        
        .lo{
            text-align: center; 
            margin-right: auto; 
            margin-left: auto; 
            width: 55%;
        }
        
        .divprin{
            border: 3px solid black;
            padding: 10px;
            margin: 5px;
        }
    </style>
<body class="lo">
    <div class="divprin">
    <xsl:for-each select="root">
        <p>Provincia: <xsl:value-of select="provincia"/></p>
        <p>Nombre: <xsl:value-of select="nombre"/></p>
    </xsl:for-each>
    <xsl:for-each select="prediccion">
                <h2> <xsl:value-of select="fecha"/></h2>
                </xsl:for-each>
            <div class="lo">    
            <table style="text-align: center" border="1">
                    <tr bgcolor="blue">
                        <th style="text-align:left">Data</th>
                        <th style="text-align:left">Temperatura Maxima</th>
                        <th style="text-align:left">Temperatura Minima</th>
                        <th style="text-align:left">Icono</th>
                    </tr>
                       <xsl:for-each select="root/prediccion/dia">
                        <tr>
                            <td><xsl:value-of select="@fecha"/></td>
                            <td><xsl:value-of select="temperatura/maxima"/></td>
                            <td><xsl:value-of select="temperatura/minima"/></td>
                            <td>
                            <xsl:choose>
                                <xsl:when test="estado_cielo/@descripcio=Despejado">
                                    <img src="sol.png"/>
                                </xsl:when>
                                <xsl:otherwise>
                                    <img src="nube.png"/>
                                </xsl:otherwise>
                            </xsl:choose>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
                </div>
        </div>
    
</body>
</html>
</xsl:template>
</xsl:stylesheet>