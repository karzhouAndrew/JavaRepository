<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
                xmlns:xsd="http://www.it-academy.by">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <head>
            <body>
                <table border="1" bgcolor="BLACK">
                    <caption>
                        <font color="RED">PointsList</font>
                    </caption>
                    <tr align="centre" bgcolor="BLUE">
                        <th>
                            <font color="YELLOW">X</font>
                        </th>
                        <th>
                            <font color="YELLOW">Y</font>
                        </th>
                    </tr>
                    <xsl:apply-templates/>
                </table>
            </body>
        </head>
    </xsl:template>

    <xsl:template match="xsd:point">
        <tr bgcolor="WHITE">
            <xsl:apply-templates/>
        </tr>
    </xsl:template>

    <xsl:template match="xsd:x">
        <td align="centre">
            <font color="GREEN">
                <xsl:value-of select="text()"/>
                <span>&#160;</span>
                <xsl:value-of select="../attribute::units"/>
            </font>
        </td>
    </xsl:template>

    <xsl:template match="xsd:y">
        <td align="centre">
            <font color="GREEN">
                <xsl:value-of select="text()"/>
                <span>&#160;</span>
                <xsl:value-of select="../attribute::units"/>
            </font>
        </td>
    </xsl:template>

</xsl:stylesheet>