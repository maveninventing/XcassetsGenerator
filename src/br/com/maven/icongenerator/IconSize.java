/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.maven.icongenerator;

/**
 *
 * @author marison
 */
public class IconSize {
    
    private String name;
    private Integer width;
    private Integer height;
    private String idiom;
    private String scale;
    private String realSize;
        
    public IconSize(){
        
    }
    
    public IconSize(String name, Integer width, Integer height, String idiom, String scale, String realSize){
        this.name=name;
        this.width=width;
        this.height=height;
        this.idiom=idiom;
        this.scale=scale;
        this.realSize=realSize;
    }

    public String getRealSize() {
        return realSize;
    }

    public void setRealSize(String realSize) {
        this.realSize = realSize;
    }
    
    

    public String getIdiom() {
        return idiom;
    }

    public void setIdiom(String idiom) {
        this.idiom = idiom;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }
    
    

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
    
}
