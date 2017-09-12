import java.util.Random;

public class ColorHex {

    private String generated;

    public ColorHex() {
        generated = "";
    }

    public static String getRGB(ColorHex colorHex) {
        String rgb;
        while (colorHex.generated.contains(rgb = getRGB()));
        colorHex.generated += rgb;
        return rgb;
    }

    public static String getRGB() {
        String rgb;
        Random hexes[] = new Random[6];
        for (int i = 0; i < hexes.length; i++)
            hexes[i] = new Random();
        rgb = "#"
                + Integer.toHexString(hexes[0].nextInt(15))
                + Integer.toHexString(hexes[1].nextInt(15))
                + Integer.toHexString(hexes[2].nextInt(15))
                + Integer.toHexString(hexes[3].nextInt(15))
                + Integer.toHexString(hexes[4].nextInt(15))
                + Integer.toHexString(hexes[5].nextInt(15));
        return rgb;
    }

}
