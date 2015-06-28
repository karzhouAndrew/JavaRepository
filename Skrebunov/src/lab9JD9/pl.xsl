<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">
    <xsl:template match="/">
        <html>
            <body>
                <p>Points</p>
                <xsl:for-each select="pointsList/point">
                    <tr>
                        <td>
                            <xsl:value-of select="x"/>
                            <xsl:value-of select="y"/>
                        </td>
                        <td>
                            <xsl:value-of select="@unit"/>
                        </td>
                    </tr>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
