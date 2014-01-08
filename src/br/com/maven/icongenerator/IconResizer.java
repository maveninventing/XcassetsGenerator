/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.maven.icongenerator;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author marison
 */
public class IconResizer {

    private static String folder = "projetos\\centaurus\\";
    private static final List<IconSize> icons = new ArrayList<IconSize>();
    private static final List<LaunchSize> portraits = new ArrayList<LaunchSize>();
    private static final List<LaunchSize> landscapes = new ArrayList<LaunchSize>();
    private static final List<LaunchSize> appstore = new ArrayList<LaunchSize>();
    private static final List<LaunchSize> googlePlay = new ArrayList<LaunchSize>();
    private static LaunchSize android_splash = null;

    static {
        icons.add(new IconSize("Icon-72@2x.png", 144, 144, "ipad", "2x", "72x72"));
        icons.add(new IconSize("Icon-72.png", 72, 72, "ipad", "1x", "72x72"));
        icons.add(new IconSize("Icon@2x.png", 114, 114, "iphone", "2x", "57x57"));
        icons.add(new IconSize("Icon.png", 57, 57, "iphone", "1x", "57x57"));
        icons.add(new IconSize("Icon-58.png", 58, 58, "iphone", "1x", "58x58"));
        icons.add(new IconSize("Icon-Ipad-58.png", 58, 58, "ipad", "2x", "29x29"));
        icons.add(new IconSize("Icon-Small@2x.png", 58, 58, "iphone", "2x", "29x29"));
        icons.add(new IconSize("Icon-Small-50@2x.png", 100, 100, "ipad", "2x", "50x50"));
        icons.add(new IconSize("Icon-Small-50.png", 50, 50, "ipad", "1x", "50x50"));
        icons.add(new IconSize("Icon-76@2x.png", 152, 152, "ipad", "2x", "76x76"));
        icons.add(new IconSize("Icon-76.png", 76, 76, "ipad", "1x", "76x76"));
        icons.add(new IconSize("Icon-60@2x.png", 120, 120, "iphone", "2x", "60x60"));
        icons.add(new IconSize("Icon-60.png", 60, 60, "iphone", "1x", "60x60"));
        icons.add(new IconSize("Icon-40@2x.png", 80, 80, "iphone", "2x", "40x40"));
        icons.add(new IconSize("Icon-40.png", 40, 40, "ipad", "1x", "40x40"));
        icons.add(new IconSize("Icon-Small.png", 29, 29, "iphone", "1x", "29x29"));
        icons.add(new IconSize("Icon-IPad-Small.png", 29, 29, "ipad", "1x", "29x29"));
        icons.add(new IconSize("Icon-Ipad-40@2x.png", 80, 80, "ipad", "2x", "40x40"));

        portraits.add(new LaunchSize("iphone@2x.png", 640, 960, "iphone", "2x", "", "portrait", "full-screen", "7.0", ""));
        portraits.add(new LaunchSize("iphone~2@2x.png", 640, 1136, "iphone", "2x", "", "portrait", "full-screen", "7.0", "retina4"));
        portraits.add(new LaunchSize("ipad.png", 768, 1024, "ipad", "1x", "", "portrait", "full-screen", "7.0", ""));
        portraits.add(new LaunchSize("ipad@2x.png", 1536, 2048, "ipad", "2x", "", "portrait", "full-screen", "7.0", ""));
        portraits.add(new LaunchSize("iphone_320.png", 320, 480, "iphone", "1x", "", "portrait", "full-screen", "", ""));
        portraits.add(new LaunchSize("iphone_320@2x.png", 640, 960, "iphone", "2x", "", "portrait", "full-screen", "", ""));
        portraits.add(new LaunchSize("iphone_640@2x.png", 640, 1136, "iphone", "2x", "", "portrait", "full-screen", "", "retina4"));
        portraits.add(new LaunchSize("ipad_statusbar.png", 768, 1004, "ipad", "1x", "", "portrait", "to-status-bar", "", ""));
        portraits.add(new LaunchSize("ipad_statusbar@2x.png", 1536, 2008, "ipad", "2x", "", "portrait", "to-status-bar", "", ""));
        portraits.add(new LaunchSize("ipad_old.png", 768, 1024, "ipad", "1x", "", "portrait", "full-screen", "", ""));
        portraits.add(new LaunchSize("ipad_old@2x.png", 1536, 2048, "ipad", "2x", "", "portrait", "full-screen", "", ""));

        android_splash = new LaunchSize("splash.jpg", 768, 1024, "android", "1x", "", "portrait", "full-screen", "", "");

        landscapes.add(new LaunchSize("ipad_land.png", 1024, 768, "ipad", "1x", "", "landscape", "full-screen", "7.0", ""));
        landscapes.add(new LaunchSize("ipad_land@2x.png", 2048, 1536, "ipad", "2x", "", "landscape", "full-screen", "7.0", ""));
        landscapes.add(new LaunchSize("ipad_statusbar_land.png", 1024, 748, "ipad", "1x", "", "landscape", "to-status-bar", "", ""));
        landscapes.add(new LaunchSize("ipad_statusbar_land@2x.png", 2048, 1496, "ipad", "2x", "", "landscape", "to-status-bar", "", ""));
        landscapes.add(new LaunchSize("ipad_land_old.png", 1024, 768, "ipad", "1x", "", "landscape", "full-screen", "", ""));
        landscapes.add(new LaunchSize("ipad_land_old@2x.png", 2048, 1536, "ipad", "2x", "", "landscape", "full-screen", "", ""));

        appstore.add(new LaunchSize("3-5_inch_retina_display.png", 960, 640, "ipad", "2x", "", "landscape", "full-screen", "", ""));
        appstore.add(new LaunchSize("4_inch_retina_display.png", 1136, 600, "ipad", "2x", "", "landscape", "full-screen", "", ""));
        appstore.add(new LaunchSize("ipad_screenshot.png", 1024, 768, "ipad", "2x", "", "landscape", "full-screen", "", ""));

    }

    public static void main(String args[]) throws Exception {
        inicia("centaurus",new File(folder + "icon.png"), new File(folder + "portrait.png"), new File(folder + "landscape.png"));
    }

    public static void inicia(String project,File icon, File portrait, File landscape) throws Exception {

        SystemLog.log("Iniciando projeto "+project);
        folder="projetos\\"+project;

        File icones = new File(folder + File.separator + "Media.xcassets" + File.separator + "AppIcon.appiconset");
        if (!icones.exists()) {
            icones.mkdirs();
        }
        for (IconSize size : icons) {
            File dest = new File(icones, size.getName());
            SystemLog.log("Criando imagem " + dest.getAbsolutePath());
            resizeUsingJavaAlgo(icon.getAbsolutePath(), dest, size.getWidth(), size.getHeight());
        }
        criaIconContents(icones);

        icones = new File(folder + File.separator + "Media.xcassets" + File.separator + "LaunchImage.launchimage");
        if (!icones.exists()) {
            icones.mkdirs();
        }
        for (LaunchSize size : portraits) {
            if (size.getWidth() > 0) {
                File dest = new File(icones, size.getName());
                SystemLog.log("Criando imagem " + dest.getAbsolutePath());
                resizeUsingJavaAlgo(portrait.getAbsolutePath(), dest, size.getWidth(), size.getHeight());
            }
        }
        for (LaunchSize size : landscapes) {
            if (size.getWidth() > 0) {
                File dest = new File(icones, size.getName());
                SystemLog.log("Criando imagem " + dest.getAbsolutePath());
                resizeUsingJavaAlgo(landscape.getAbsolutePath(), dest, size.getWidth(), size.getHeight());
            }
        }
        criaLaunchContents(icones);

        icones = new File(folder + File.separator + "AppStore");
        if (!icones.exists()) {
            icones.mkdirs();
        }
        for (LaunchSize size : appstore) {
            if (size.getWidth() > 0) {
                File dest = new File(icones, size.getName());
                SystemLog.log("Criando imagem " + dest.getAbsolutePath());
                resizeUsingJavaAlgo(landscape.getAbsolutePath(), dest, size.getWidth(), size.getHeight());
            }
        }
        icones = new File(folder + File.separator + "GooglePlay");

        icones = new File(folder + File.separator + "Android");
        criaEstruturaAndroid(icones, icon, portrait, landscape);

    }

    public static void criaEstruturaAndroid(File folder, File icon, File portrait, File landscape) throws Exception {
        File res = criaPasta(folder, "res");
        String[] pastas = new String[]{"drawable", "drawable-hdpi", "drawable-land", "drawable-land-hdpi", "drawable-land-mdpi", "drawable-land-xhdpi", "drawable-mdpi","drawable-xhdpi", "drawable-xxhdpi", "values", "values-v14"};
        for (String pasta : pastas) {
            criaPasta(res, pasta);
        }
        copiaModel(new File(res, pastas[0]), "android\\actionbar_background.xml");        
        for (int i = 1; i <= 8; i++) {
            copiaModel(new File(res, pastas[i]), "android\\fundo.jpg");
        }
        resizeUsingJavaAlgo(portrait.getAbsolutePath(), new File(res, pastas[0] + File.separator + "splash.jpg"), android_splash.getWidth(), android_splash.getHeight());
        resizeUsingJavaAlgo(icon.getAbsolutePath(), new File(res, pastas[1] + File.separator + "ic_launcher.png"), 512,512);
        resizeUsingJavaAlgo(icon.getAbsolutePath(), new File(res, pastas[6] + File.separator + "ic_launcher.png"), 512,512);
        resizeUsingJavaAlgo(icon.getAbsolutePath(), new File(res, pastas[7] + File.separator + "ic_launcher.png"), 512,512);
        resizeUsingJavaAlgo(icon.getAbsolutePath(), new File(res, pastas[8] + File.separator + "ic_launcher.png"), 512,512);
        
        copiaModel(new File(res, pastas[9]), "android\\config.xml");
        copiaModel(new File(res, pastas[9]), "android\\strings.xml");
        copiaModel(new File(res, pastas[9]), "android\\styles.xml");
        copiaModel(new File(res, pastas[10]), "android\\v14\\styles.xml");        
        
    }

    public static void criaIconContents(File folder) throws Exception {
        StringBuilder buff = new StringBuilder();
        buff.append("{ \"images\": [ ");

        int i = 0;
        for (IconSize size : icons) {
            buff.append(" { ");
            buff.append("\"size\" : \"").append(size.getRealSize()).append("\",");
            buff.append("\"idiom\" : \"").append(size.getIdiom()).append("\",");
            buff.append("\"filename\" : \"").append(size.getName()).append("\",");
            buff.append("\"scale\" : \"").append(size.getScale()).append("\"");
            buff.append(" }");
            if (i < (icons.size() - 1)) {
                buff.append(",");
            }
            i++;
        }
        buff.append("],");
        buff.append("\"info\" : {");
        buff.append("\"version\" : 1,");
        buff.append("\"author\" : \"xcode\"");
        buff.append("}");
        buff.append("}");
        File contents = new File(folder, "Contents.json");
        IOUtils.write(buff.toString(), new FileOutputStream(contents));;

    }

    public static void criaLaunchContents(File folder) throws Exception {
        StringBuilder buff = new StringBuilder();
        buff.append("{ \"images\": [ ");

        int i = 0;
        List<LaunchSize> list = new ArrayList<LaunchSize>();
        list.addAll(portraits);
        list.addAll(landscapes);
        for (LaunchSize size : list) {
            buff.append(" { ");
            buff.append("\"orientation\" : \"").append(size.getOrientation()).append("\",");
            buff.append("\"idiom\" : \"").append(size.getIdiom()).append("\",");
            if (StringUtils.isNotBlank(size.getName())) {
                buff.append("\"filename\" : \"").append(size.getName()).append("\",");
            }
            buff.append("\"scale\" : \"").append(size.getScale()).append("\"");

            if (StringUtils.isNotBlank(size.getExtent())) {
                buff.append(",\"extent\" : \"").append(size.getExtent()).append("\"");
            }
            if (StringUtils.isNotBlank(size.getSubtype())) {
                buff.append(",\"subtype\" : \"").append(size.getSubtype()).append("\"");
            }
            if (StringUtils.isNotBlank(size.getMinimumSystemVersion())) {
                buff.append(",\"minimum-system-version\" : \"").append(size.getMinimumSystemVersion()).append("\"");
            }
            buff.append(" }");
            if (i < (list.size() - 1)) {
                buff.append(",");
            }
            i++;
        }

        buff.append("],");
        buff.append("\"info\" : {");
        buff.append("\"version\" : 1,");
        buff.append("\"author\" : \"xcode\"");
        buff.append("}");
        buff.append("}");
        File contents = new File(folder, "Contents.json");
        IOUtils.write(buff.toString(), new FileOutputStream(contents));;

    }

    public static boolean resizeUsingJavaAlgo(String source, File dest, int width, int height) throws IOException {
        BufferedImage sourceImage = ImageIO.read(new FileInputStream(source));
        double ratio = (double) sourceImage.getWidth() / sourceImage.getHeight();
        if (width < 1) {
            width = (int) (height * ratio + 0.4);
        } else if (height < 1) {
            height = (int) (width / ratio + 0.4);
        }

        Image scaled = sourceImage.getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING);
        BufferedImage bufferedScaled = new BufferedImage(scaled.getWidth(null), scaled.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedScaled.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2d.drawImage(scaled, 0, 0, width, height, null);
        dest.createNewFile();
        writeJpeg(bufferedScaled, dest.getCanonicalPath(), 1.0f);
        return true;
    }

    /**
     * Write a JPEG file setting the compression quality.
     *     
* @param image a BufferedImage to be saved
     * @param destFile destination file (absolute or relative path)
     * @param quality a float between 0 and 1, where 1 means uncompressed.
     * @throws IOException in case of problems writing the file
     */
    private static void writeJpeg(BufferedImage image, String destFile, float quality)
            throws IOException {
        ImageWriter writer = null;
        FileImageOutputStream output = null;
        try {
            ImageWriteParam param = null;
            if (destFile.endsWith("jpg")) {
                writer = ImageIO.getImageWritersByFormatName("jpg").next();
                param = writer.getDefaultWriteParam();
                param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                param.setCompressionQuality(quality);
            } else {
                writer = ImageIO.getImageWritersByFormatName("png").next();
                param = writer.getDefaultWriteParam();
//            param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
//            param.setCompressionQuality(quality);
            }
            output = new FileImageOutputStream(new File(destFile));
            writer.setOutput(output);
            IIOImage iioImage = new IIOImage(image, null, null);
            writer.write(null, iioImage, param);
        } catch (IOException ex) {
            throw ex;
        } finally {
            if (writer != null) {
                writer.dispose();
            }
            if (output != null) {
                output.close();
            }
        }
    }

    private static File copiaModel(File folder, String file) throws Exception {
        File arquivo = new File("model" + File.separator + file);
        File dest = new File(folder, new File(file).getName());
        FileInputStream in = new FileInputStream(arquivo);
        FileOutputStream out = new FileOutputStream(dest);
        try {
            IOUtils.copy(in, out);
        } finally {
            IOUtils.closeQuietly(in);
            IOUtils.closeQuietly(out);
        }
        return dest;
    }

    private static File criaPasta(File pai, String pasta) {
        File f = new File(pai, pasta);
        if (!f.exists()) {
            f.mkdirs();
        }
        return f;
    }
}
