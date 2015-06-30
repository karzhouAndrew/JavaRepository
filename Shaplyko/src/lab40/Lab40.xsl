<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <head>
            <body>
                <h2>Points</h2>
                <table>
                    <tr bgcolor="#9acd32">
                        <th style="text-align:left">X</th>
                        <th style="text-align:left">Y</th>
                    </tr>
                    <tr>
                        <xsl:apply-templates/>
                    </tr>
                </table>
            </body>
        </head>
    </xsl:template>

    <xsl:template match="point">
        <tr>
            <xsl:apply-templates/>
        </tr>
    </xsl:template>

    <xsl:template match="x">
        <td>
            <xsl:value-of select="text()"/>
            <xsl:value-of select="../attribute::unit"/>
        </td>
    </xsl:template>
    <xsl:template match="y">
        <td>
            <xsl:value-of select="text()"/>
            <xsl:value-of select="../attribute::unit"/>
        </td>
    </xsl:template>
</xsl:stylesheet>
