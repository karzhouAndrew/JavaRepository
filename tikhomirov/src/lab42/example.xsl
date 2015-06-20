<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <h2>PointsList</h2>
        <table border="1">
            <tr bgcolor="#9acd32">
                <th style="text-align:left">X</th>
                <th style="text-align:left">Y</th>
            </tr>

            <xsl:for-each select="pointList/point">
                <tr>
                    <td>
                        <xsl:value-of select="x"/>
                        <xsl:value-of select="@unit"/>
                    </td>
                    <td>
                        <xsl:value-of select="y"/>
                        <xsl:value-of select="@unit"/>
                    </td>
                </tr>
            </xsl:for-each>

        </table>
    </xsl:template>
</xsl:stylesheet>
