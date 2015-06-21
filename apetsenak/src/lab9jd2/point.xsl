<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <p>Points</p>
                <xsl:for-each select="pointList/point">
                    <tr>
                        <td>
                            <xsl:value-of select="x"/>
                            <br/>
                        </td>
                        <td>
                            <xsl:value-of select="y"/>
                            <br/>
                        </td>
                        <td>
                            <xsl:value-of select="@units"/>
                            <br/>
                        </td>
                        <br/>
                    </tr>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>