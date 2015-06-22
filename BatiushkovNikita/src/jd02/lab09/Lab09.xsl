<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2>JD02 LAB09</h2>
                <table border="1">
                    <tr>
                        <th>x</th>
                        <th>y</th>
                    </tr>
                    <xsl:for-each select="pointList/point">
                        <tr>
                            <td>
                                <xsl:value-of select="x"/>
                                <span>&#160;</span>
                                <xsl:value-of select="@unit"/>
                            </td>
                            <td>
                                <xsl:value-of select="y"/>
                                <span>&#160;</span>
                                <xsl:value-of select="@unit"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>