package ch.bbw.vegvisir.model;

public class MathOperations {
	public static void calcValues(MathInputs input) {
		if (input.getVectorX() != null && input.getVectorY() != null) {
			if (input.getaX() != null && input.getaY() != null && input.getbX() == null && input.getbY() == null) {
				input.setbX(input.getVectorX() + input.getaX());
				input.setbY(input.getVectorY() + input.getaY());
			} else if (input.getbX() != null && input.getbY() != null && input.getaX() == null
					&& input.getaY() == null) {
				input.setaX(input.getVectorX() + input.getbX());
				input.setaY(input.getVectorY() + input.getbY());
			}

			input.setWinkelA(radiansToDegree(Math.atan(input.getVectorY() / input.getVectorX())));
			input.setWinkelB(90d);
			input.setWinkelC(90 - input.getWinkelA());

			input.setMagnitude(Math.sqrt(Math.pow(input.getVectorX(), 2) + Math.pow(input.getVectorY(), 2)));
		}

		if (input.getMagnitude() != null) {
			input.setSeiteC(input.getMagnitude());
			if (input.getSinA() != null) {
				input.setSeiteB(input.getSinA() * input.getSeiteC());
				input.setSeiteA(Math.pow(input.getSeiteC(), 2) - Math.pow(input.getSeiteB(), 2));

				input.setWinkelA(radiansToDegree(Math.asin(input.getSinA())));
				input.setWinkelB(90d);
				input.setWinkelC(90 - input.getWinkelA());
			}
		}

		input.setSinA(Math.sin(degreeToRad(input.getWinkelA())));
		input.setSinB(Math.sin(degreeToRad(input.getWinkelB())));
		input.setSinC(Math.sin(degreeToRad(input.getWinkelC())));

		input.setCosA(Math.cos(degreeToRad(input.getWinkelA())));
		input.setCosB(Math.cos(degreeToRad(input.getWinkelB())));
		input.setCosC(Math.cos(degreeToRad(input.getWinkelC())));

		input.setTanA(Math.tan(degreeToRad(input.getWinkelA())));
		input.setTanB(Math.tan(degreeToRad(input.getWinkelB())));
		input.setTanC(Math.tan(degreeToRad(input.getWinkelC())));
	}

	private static double radiansToDegree(double rad) {
		return rad * 180 / Math.PI;
	}
	
	private static double degreeToRad(double degree) {
		return degree * Math.PI / 180;
	}
}
