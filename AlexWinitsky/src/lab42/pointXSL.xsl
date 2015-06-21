<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2>Coordinates</h2>
                <table border="1">
                    <tr bgcolor="#9acd32">
                        <th>Value X</th>
                        <th>Value Y</th>
                        <th>Unit</th>
                    </tr>
                    <xsl:for-each select="pointsList/point">
                        <tr>
                            <td>
                                <xsl:value-of select="x"/>
                            </td>
                            <td>
                                <xsl:value-of select="y"/>
                            </td>
                            <td>
                                <xsl:value-of select="./@units" />
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
        </xsl:template>

</xsl:stylesheet>