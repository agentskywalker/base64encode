package com.agentskywalker.base64encode;

import org.apache.commons.codec.binary.Base64;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class PasswordUtility {
    public static void main(String[] args) {

        if (args.length > 0){
            String  encode = args[0];

            System.out.println("Input String is ::" + encode);
            byte[] bytesEncoded = Base64.encodeBase64(encode.getBytes());
            String  bytesEncodedString = new String(bytesEncoded);
            System.out.println("Encoded Value is ::" + bytesEncodedString);

            Clipboard   clipboard   = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection selection   = new StringSelection(bytesEncodedString);
            clipboard.setContents(selection, null);
            System.out.println("\n****** Output Encoded value is copied to system Clipboard *****\n");
        }
        else
            System.out.println("No command line argument entered. Please run the tool with input String");
    }
}