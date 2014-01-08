/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.maven.icongenerator;

/**
 *
 * @author marison
 */
public class LaunchSize extends IconSize {
    
    private String orientation;
    private String extent;
    private String minimumSystemVersion;
    private String subtype;
    
    public LaunchSize(String name, Integer width, Integer height, String idiom, String scale, String realSize, String orientation, String extent,String minimumSystemVersion,String subtype ){
        super(name,width,height,idiom,scale,realSize);
        this.orientation=orientation;
        this.extent=extent;
        this.minimumSystemVersion=minimumSystemVersion;
        this.subtype=subtype;
    }

    public String getExtent() {
        return extent;
    }

    public void setExtent(String extent) {
        this.extent = extent;
    }

    public String getMinimumSystemVersion() {
        return minimumSystemVersion;
    }

    public void setMinimumSystemVersion(String minimumSystemVersion) {
        this.minimumSystemVersion = minimumSystemVersion;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }
    
    
}
