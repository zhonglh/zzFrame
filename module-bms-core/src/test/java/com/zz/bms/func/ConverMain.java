package com.zz.bms.func;

public class ConverMain {


    public void formRecogtest( String recogType) {


        // 将原始数据处理成需要返回的数据
        if (recogType != null && recogType.equals("SH")) {
            delResult( ConvertData::vechileConvertSh);
        } else {
            delResult( ConvertData::vechileConvertBj);
        }

    }


    public void delResult(ConvertPredict<TableCell , VechileBody> predict){

        TableCell cell = null;
        VechileBody body = null;
        predict.convert(cell , body);
    }


    public static void main(String[] args) {
        ConverMain cm = new ConverMain();
        cm.formRecogtest("SH");
        cm.formRecogtest("BJ");
    }

}
