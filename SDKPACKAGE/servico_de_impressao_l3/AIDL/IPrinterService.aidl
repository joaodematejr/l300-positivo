// IPrinterService.aidl
package com.xcheng.printerservice;
import com.xcheng.printerservice.IPrinterCallback;
//import java.util.List;
//import java.util.Map;

// Declare any non-default types here with import statements

interface IPrinterService {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */

    void upgradePrinter();

    String getFirmwareVersion();

    String getBootloaderVersion();

    void printerInit(in IPrinterCallback callback);

    void printerReset(in IPrinterCallback callback);

	void printWrapPaper(int n, in IPrinterCallback callback);

	void printText(String text, in IPrinterCallback callback);

	void printTextWithAttributes(String text, in Map attributes, in IPrinterCallback callback);

	void printColumnsTextWithAttributes(in String[] text, in List attributes,in IPrinterCallback callback);

	void printBitmap(in Bitmap bitmap, in IPrinterCallback callback);

	void printBitmapWithAttributes(in Bitmap bitmap, in Map attributes, in IPrinterCallback callback);

	void printBarCode(String content,int align,int width,int height,boolean showContent,in IPrinterCallback callback);

	void printQRCode(String text, int align, int size, in IPrinterCallback callback);

	void setPrinterSpeed(int level, in IPrinterCallback callback);

	void sendRAWData(in byte[] data, in IPrinterCallback callback);

	int printerTemperature(in IPrinterCallback callback);

	boolean printerPaper(in IPrinterCallback callback);

	void printStepWrapPaper(int n, in IPrinterCallback callback);

	void printBase64Bitmap(in Bitmap bitmap, in IPrinterCallback callback);

    void printBase64BitmapWithAttributes(in Bitmap bitmap, in Map attributes, in IPrinterCallback callback);
}