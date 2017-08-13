package com.ducust.data.structure;

/**
 * Created by Custing on 2017/8/13.
 */
public class SequentialList {
    static final int MAXLEN = 100;

    class DATA {
        String key;
        String name;
        int age;
    }

    class SLType {
        DATA[] ListData = new DATA[MAXLEN + 1];
        int ListLen;
    }

    void SLInit(SLType SL) {
        SL.ListLen = 0;
    }

    int SLLength(SLType SL) {
        return SL.ListLen;
    }

    int SLInsert(SLType sl, int n, DATA data) {

        int i;
        if (sl.ListLen >= MAXLEN) {
            System.out.println("out of Size!!");
        }
        if (n < 1 || n > sl.ListLen - 1) {
            System.out.println("insert index error !!");
            return 0;
        }

        for (i = sl.ListLen; i >= n; i--) {
            sl.ListData[i + 1] = sl.ListData[i];
        }
        sl.ListData[n] = data;
        sl.ListLen++;
        return 1;
    }

    int SLAdd(SLType SL, DATA data) {
        if (SL.ListLen > MAXLEN) {
            System.out.println("out of size !!");
            return 0;
        }
        SL.ListData[++SL.ListLen] = data;
        return 1;
    }

    DATA SLFindByNum(SLType sl, int n) {
        if (n < 1 || n > sl.ListLen + 1) {
            System.out.println("index error defiend!!");
            return null;
        }
        return sl.ListData[n];
    }

    int SLFindByCont(SLType sl, String key) {
        int i;
        for (i = 1; i < sl.ListLen; i++) {
            if (sl.ListData[i].key.compareTo(key) == 0) {
                return i;
            }
        }
        return 0;
    }

    int SLAll(SLType sl) {

        for (DATA data : sl.ListData) {
            System.out.printf("(%s,%s,%d)", data.key, data.name, data.age);
        }
        return 0;
    }


}
