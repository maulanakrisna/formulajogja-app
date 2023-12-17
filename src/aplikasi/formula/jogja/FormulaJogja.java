/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.formula.jogja;

import java.io.Serializable;

/**
 *
 * @author M K Adhitya
 */
public class FormulaJogja implements Serializable {

    private double LF_Trafo, LF_TM, LF_TR, LF_SR, cos_TM, cos_Trafo, cos_TR,
            cos_SR;
    private int periodePerhitungan, jumlahJurusan, jumlahPelanggan,
            jumlahPenyulang;
    private long penerimaan, penjualanTotal, penjualan_TM, penjualan_TT, ps_gd;
    private final double k_SKTMCu16 = 1.15,
            k_SKTMCu25 = 0.727,
            k_SKTMCu35 = 0.521,
            k_SKTMCu50 = 0.387,
            k_SKTMCu70 = 0.268,
            k_SKTMCu90 = 0.193,
            k_SKTMCu120 = 0.153,
            k_SKTMCu150 = 0.124,
            k_SKTMCu185 = 0.099,
            k_SKTMCu240 = 0.075,
            k_SKTMCu300 = 0.06,
            k_SKTMCu400 = 0.047,
            k_SKTMAl16 = 1.91,
            k_SKTMAl25 = 1.2,
            k_SKTMAl35 = 0.868,
            k_SKTMAl50 = 0.641,
            k_SKTMAl70 = 0.443,
            k_SKTMAl90 = 0.32,
            k_SKTMAl120 = 0.253,
            k_SKTMAl150 = 0.206,
            k_SKTMAl185 = 0.164,
            k_SKTMAl240 = 0.125,
            k_SKTMAl300 = 0.1,
            k_SKTMAl400 = 0.078;
    private final double k_SUTMCu16 = 1.1465,
            k_SUTMCu25 = 0.7512,
            k_SUTMCu35 = 0.5302,
            k_SUTMCu50 = 0.3785,
            k_SUTMCu70 = 0.2781,
            k_SUTMCu95 = 0.1963,
            k_SUTMCu110 = 0.17,
            k_SUTMCu120 = 0.1565,
            k_SUTMCu150 = 0.1244,
            k_SUTMCu185 = 0.1008,
            k_SUTMCu240 = 0.0755,
            k_SUTMCu300 = 0.0611,
            k_SUTMCu400 = 0.0458,
            k_SUTMCu500 = 0.0367,
            k_SUTMAl16 = 1.955,
            k_SUTMAl25 = 1.183,
            k_SUTMAl35 = 0.958,
            k_SUTMAl50 = 0.665,
            k_SUTMAl70 = 0.438,
            k_SUTMAl95 = 0.355,
            k_SUTMAl100 = 0.332,
            k_SUTMAl120 = 0.293,
            k_SUTMAl150 = 0.21,
            k_SUTMAl185 = 0.183,
            k_SUTMAl240 = 0.137,
            k_SUTMAl300 = 0.111,
            k_SUTMAl400 = 0.077,
            k_SUTMAl500 = 0.066;
    private final double k_TRCu6 = 2.8994,
            k_TRCu10 = 1.8565,
            k_TRCu16 = 1.1465,
            k_TRCu25 = 0.7512,
            k_TRCu35 = 0.5302,
            k_TRCu50 = 0.3785,
            k_TRCu70 = 0.2781,
            k_TRCu95 = 0.1963,
            k_TRCu110 = 0.17,
            k_TRCu120 = 0.1565,
            k_TRCu150 = 0.1244,
            k_TRCu185 = 0.1008,
            k_TRCu240 = 0.0755,
            k_TRCu300 = 0.0611,
            k_TRCu400 = 0.0458,
            k_TRCu500 = 0.0367,
            k_TRAl16 = 1.955,
            k_TRAl25 = 1.183,
            k_TRAl35 = 0.958,
            k_TRAl50 = 0.665,
            k_TRAl70 = 0.438,
            k_TRAl95 = 0.355,
            k_TRAl100 = 0.332,
            k_TRAl120 = 0.293,
            k_TRAl150 = 0.21,
            k_TRAl185 = 0.183,
            k_TRAl240 = 0.137,
            k_TRAl300 = 0.111,
            k_TRAl400 = 0.077,
            k_TRAl500 = 0.066;
    private final double k_SRCu6 = 3.08,
            k_SRCu10 = 1.83,
            k_SRCu16 = 1.15,
            k_SRAl10 = 3.08,
            k_SRAl16 = 1.91;
    private final double lfe_trafo25 = 0.115,
            lfe_trafo50 = 0.19,
            lfe_trafo100 = 0.32,
            lfe_trafo160 = 0.46,
            lfe_trafo200 = 0.55,
            lfe_trafo250 = 0.65,
            lfe_trafo315 = 0.77,
            lfe_trafo400 = 0.93,
            lfe_trafo500 = 1.1,
            lfe_trafo630 = 1.3,
            lfe_trafo800 = 1.95,
            lfe_trafo1000 = 2.3,
            lfe_trafo1250 = 2.7,
            lfe_trafo1600 = 3.3,
            lfe_trafo2000 = 3.9,
            lfe_trafo2500 = 4.5;
    private final double lcu_trafo25 = 0.7,
            lcu_trafo50 = 1.1,
            lcu_trafo100 = 1.75,
            lcu_trafo160 = 2.35,
            lcu_trafo200 = 2.85,
            lcu_trafo250 = 3.25,
            lcu_trafo315 = 3.9,
            lcu_trafo400 = 4.6,
            lcu_trafo500 = 5.5,
            lcu_trafo630 = 6.5,
            lcu_trafo800 = 10.2,
            lcu_trafo1000 = 12.1,
            lcu_trafo1250 = 15,
            lcu_trafo1600 = 18.1,
            lcu_trafo2000 = 21,
            lcu_trafo2500 = 28;
    private int panjangSktmCu16, panjangSktmCu25, panjangSktmCu35,
            panjangSktmCu50, panjangSktmCu70, panjangSktmCu90, panjangSktmCu120,
            panjangSktmCu150, panjangSktmCu185, panjangSktmCu240,
            panjangSktmCu300, panjangSktmCu400;
    private int panjangSktmAl16, panjangSktmAl25, panjangSktmAl35,
            panjangSktmAl50, panjangSktmAl70, panjangSktmAl90, panjangSktmAl120,
            panjangSktmAl150, panjangSktmAl185, panjangSktmAl240,
            panjangSktmAl300, panjangSktmAl400;
    private int panjangSutmCu16, panjangSutmCu25, panjangSutmCu35,
            panjangSutmCu50, panjangSutmCu70, panjangSutmCu95, panjangSutmCu110,
            panjangSutmCu120, panjangSutmCu150, panjangSutmCu185,
            panjangSutmCu240, panjangSutmCu300, panjangSutmCu400,
            panjangSutmCu500;
    private int panjangSutmAl16, panjangSutmAl25, panjangSutmAl35,
            panjangSutmAl50, panjangSutmAl70, panjangSutmAl95, panjangSutmAl100,
            panjangSutmAl120, panjangSutmAl150, panjangSutmAl185,
            panjangSutmAl240, panjangSutmAl300, panjangSutmAl400,
            panjangSutmAl500;
    private int panjangSutrCu6, panjangSutrCu10, panjangSutrCu16, panjangSutrCu25,
            panjangSutrCu35, panjangSutrCu50, panjangSutrCu70, panjangSutrCu95,
            panjangSutrCu110, panjangSutrCu120, panjangSutrCu150, panjangSutrCu185,
            panjangSutrCu240, panjangSutrCu300, panjangSutrCu400,
            panjangSutrCu500;
    private int panjangSutrAl16, panjangSutrAl25, panjangSutrAl35,
            panjangSutrAl50, panjangSutrAl70, panjangSutrAl95, panjangSutrAl100,
            panjangSutrAl120, panjangSutrAl150, panjangSutrAl185,
            panjangSutrAl240, panjangSutrAl300, panjangSutrAl400,
            panjangSutrAl500;
    private int panjangSrCu6, panjangSrCu10, panjangSrCu16, panjangSrAl10,
            panjangSrAl16;
    private int jumlahTrafo25, jumlahTrafo50, jumlahTrafo100, jumlahTrafo160,
            jumlahTrafo200, jumlahTrafo250, jumlahTrafo315, jumlahTrafo400,
            jumlahTrafo500, jumlahTrafo630, jumlahTrafo800, jumlahTrafo1000,
            jumlahTrafo1250, jumlahTrafo1600, jumlahTrafo2000, jumlahTrafo2500;

    public FormulaJogja() {
        setEmpty();
    }

    public double susutTotalPersen() {
        if (getPenerimaan() == 0) {
            return 0;
        } else {
            return (double) susutTotal() / (double) getPenerimaan();
        }
    }

    public double susutTeknisPersen() {
        if (getPenerimaan() == 0) {
            return 0;
        } else {
            return (double) susutTeknis() / (double) getPenerimaan();
        }
    }

    public double susutNonTeknisPersen() {
        if (getPenerimaan() == 0) {
            return 0;
        } else {
            return (double) susutNonTeknis() / (double) getPenerimaan();
        }
    }

    public long susutNonTeknis() {
        return susutTotal() - susutTeknis();
    }

    public long susutTeknis() {
        return susutTm() + susutTr() + susutTrafo() + susutSr();
    }

    public double susutSrInputTotal() {
        if (getPenerimaan() == 0) {
            return 0;
        } else {
            return (double) susutSr() / (double) getPenerimaan();
        }
    }

    public double susutSrInput() {
        if (inputanSr() == 0) {
            return 0;
        } else {
            return (double) susutSr() / (double) inputanSr();
        }
    }

    public long susutSr() {
        return (long) (rugiSr() * getJumlahPelanggan() * getPeriodePerhitungan());
    }

    public double rugiSr() {
        double a = rEqSr() / 1000;
        double b = panjangSRrerata() / 1000;
        double c = Math.pow((iekSr() / 0.22), 2);
        return 2 * a * b * c * faktorKoreksiSr();
    }

    public double iekSr() {
        double a = getJumlahPelanggan() * getPeriodePerhitungan() * getCos_SR() * getLF_SR();
        return inputanSr() / a;
    }

    public long inputanSr() {
        return inputanTr() - susutTr();
    }

    public double susutTrInputTotal() {
        if (getPenerimaan() == 0) {
            return 0;
        } else {
            return (double) susutTr() / (double) getPenerimaan();
        }
    }

    public double susutTrInput() {
        if (inputanTr() == 0) {
            return 0;
        } else {
            return (double) susutTr() / (double) inputanTr();
        }
    }

    public long susutTr() {
        return (long) (rugiTr() * getJumlahJurusan() * faktorSusutTr() * getPeriodePerhitungan());
    }

    public double rugiTr() {
        double a = 3 * Math.pow(iekTr() / (1.732 * 0.38), 2);
        double b = rEqTr() / 1000;
        double c = panjangTRrerata() / 1000;
        return a * b * c * faktorKoreksiTr();
    }

    public double iekTr() {
        double a = inputanTr() / (getJumlahJurusan() * getLF_TR() * getCos_TR() * getPeriodePerhitungan());
        double b = nodePerJurusan();
        double c = Math.pow(a, 2);
        double d = Math.pow(a, 2) / b;
        double e = Math.pow((a / b), 2);
        return Math.sqrt((c + d + e) / 3);
    }

    public double nodePerJurusan() {
        return Math.ceil((double) panjangTRrerata() / 50);
    }

    public long inputanTr() {
        return inputanTrafo() - susutTrafo() - getPs_gd();
    }

    public double susutTrafoInputTotal() {
        if (getPenerimaan() == 0) {
            return 0;
        } else {
            return (double) susutTrafo() / (double) getPenerimaan();
        }
    }

    public double susutTrafoInput() {
        if (inputanTrafo() == 0) {
            return 0;
        } else {
            return (double) susutTrafo() / (double) inputanTrafo();
        }
    }

    public long susutTrafo() {
        return (long) (rugiTrafo() * jumlahTrafo() * faktorSusutTrafo() * getPeriodePerhitungan());
    }

    public double rugiTrafo() {
        double a = lfeEq() / faktorSusutTrafo();
        double b = Math.pow(iekTrafo() / kvaTraforerata(), 2) * lcuEq();
        return (a + b) * faktorKoreksiTm();
    }

    public double iekTrafo() {
        double a = jumlahTrafo() * getPeriodePerhitungan() * getCos_TR() * getLF_TR();
        return inputanTrafo() / a;
    }

    public long inputanTrafo() {
        return inputanTm() - susutTm();
    }

    public double susutTmInputTotal() {
        if (getPenerimaan() == 0) {
            return 0;
        } else {
            return (double) susutTm() / (double) getPenerimaan();
        }
    }

    public double susutTmInput() {
        if (inputanTm() == 0) {
            return 0;
        } else {
            return (double) susutTm() / (double) inputanTm();
        }
    }

    public long susutTm() {
        return (long) (rugiTm() * getJumlahPenyulang() * faktorSusutTm() * getPeriodePerhitungan());
    }

    public double rugiTm() {
        double a = 3 * Math.pow(iekTm() / (1.732 * 20), 2);
        double b = rEqTm() / 1000;
        double c = panjangTMrerata() / 1000;
        return a * b * c * faktorKoreksiTm();
    }

    public double iekTm() {
        double a = inputanTm() / (getJumlahPenyulang() * getLF_TM() * getCos_TM() * getPeriodePerhitungan());
        double b = nodePerFeeder();
        double c = Math.pow(a, 2);
        double d = Math.pow(a, 2) / b;
        double e = Math.pow((a / b), 2);
        return Math.sqrt((c + d + e) / 3);
    }

    public double nodePerFeeder() {
        if (getJumlahPenyulang() == 0) {
            return 0;
        } else {
            return Math.ceil((double) jumlahTrafo() / (double) getJumlahPenyulang());
        }
    }

    public long inputanTm() {
        return getPenerimaan() - getPenjualan_TT();
    }

    public double faktorKoreksiTm() {

        if (panjangTMrerata() <= 15000) {
            return 1.0;
        } else if (0.91 - ((panjangTMrerata() - 15000) / panjangTMrerata()) * 0.75 <= 0.3) {
            return 0.3;
        } else {
            return 0.91 - ((panjangTMrerata() - 15000) / panjangTMrerata()) * 0.75;
        }
    }

    public double faktorKoreksiTr() {

        if (panjangTRrerata() <= 300) {
            return 1.0;
        } else if (0.91 - ((panjangTRrerata() - 300) / panjangTRrerata()) * 0.75 <= 0.3) {
            return 0.3;
        } else {
            return 0.91 - ((panjangTRrerata() - 300) / panjangTRrerata()) * 0.75;
        }
    }

    public double faktorKoreksiSr() {

        if (panjangSRrerata() <= 300) {
            return 1.0;
        } else if (0.91 - ((panjangSRrerata() - 300) / panjangSRrerata()) * 0.75 <= 0.3) {
            return 0.3;
        } else {
            return 0.91 - ((panjangSRrerata() - 300) / panjangSRrerata()) * 0.75;
        }
    }

    public double kvaTraforerata() {
        if (jumlahTrafo() == 0) {
            return 0;
        } else {
            return (double) kvaTrafo() / (double) jumlahTrafo();
        }
    }

    public double panjangSRrerata() {
        if (getJumlahPelanggan() == 0) {
            return 0;
        } else {
            return (panjangSr()) / getJumlahPelanggan();
        }
    }

    public double panjangTRrerata() {
        if (getJumlahJurusan() == 0) {
            return 0;
        } else {
            return (panjangSutr()) / getJumlahJurusan();
        }
    }

    public double panjangTMrerata() {
        if (getJumlahPenyulang() == 0) {
            return 0;
        } else {
            return (panjangSutm()) / getJumlahPenyulang();
        }
    }

    public long susutTotal() {
        return getPenerimaan() - getPenjualanTotal() - getPs_gd();
    }

    public double faktorSusutTm() {
        return (0.3 * getLF_TM()) + (0.7 * Math.pow(getLF_TM(), 2.0));
    }

    public double faktorSusutTrafo() {
        return (0.3 * getLF_Trafo()) + (0.7 * Math.pow(getLF_Trafo(), 2.0));
    }

    public double faktorSusutTr() {
        return (0.3 * getLF_TR()) + (0.7 * Math.pow(getLF_TR(), 2.0));
    }

    public double faktorSusutSr() {
        return (0.3 * getLF_SR()) + (0.7 * Math.pow(getLF_SR(), 2.0));
    }

    public long penjualanTr() {
        return getPenjualanTotal() - getPenjualan_TT() - getPenjualan_TM();
    }

    public int jumlahTrafo() {
        return getJumlahTrafo25() + getJumlahTrafo50() + getJumlahTrafo100() + getJumlahTrafo160()
                + getJumlahTrafo200() + getJumlahTrafo250() + getJumlahTrafo315() + getJumlahTrafo400()
                + getJumlahTrafo500() + getJumlahTrafo630() + getJumlahTrafo800() + getJumlahTrafo1000()
                + getJumlahTrafo1250() + getJumlahTrafo1600() + getJumlahTrafo2000() + getJumlahTrafo2500();
    }

    public int kvaTrafo() {
        return getJumlahTrafo25() * 25 + getJumlahTrafo50() * 50 + getJumlahTrafo100() * 100
                + getJumlahTrafo160() * 160 + getJumlahTrafo200() * 200 + getJumlahTrafo250() * 250
                + getJumlahTrafo315() * 315 + getJumlahTrafo400() * 400 + getJumlahTrafo500() * 500
                + getJumlahTrafo630() * 630 + getJumlahTrafo800() * 800 + getJumlahTrafo1000() * 1000
                + getJumlahTrafo1250() * 1250 + getJumlahTrafo1600() * 1600
                + getJumlahTrafo2000() * 2000 + getJumlahTrafo2500() * 2500;
    }

    public double lfeEq() {
        if (jumlahTrafo() == 0) {
            return 0.0;
        } else {
            return (getJumlahTrafo25() * lfe_trafo25 + getJumlahTrafo50() * lfe_trafo50
                    + getJumlahTrafo100() * lfe_trafo100 + getJumlahTrafo160() * lfe_trafo160
                    + getJumlahTrafo200() * lfe_trafo200 + getJumlahTrafo250() * lfe_trafo250
                    + getJumlahTrafo315() * lfe_trafo315 + getJumlahTrafo400() * lfe_trafo400
                    + getJumlahTrafo500() * lfe_trafo500 + getJumlahTrafo630() * lfe_trafo630
                    + getJumlahTrafo800() * lfe_trafo800 + getJumlahTrafo1000() * lfe_trafo1000
                    + getJumlahTrafo1250() * lfe_trafo1250 + getJumlahTrafo1600() * lfe_trafo1600
                    + getJumlahTrafo2000() * lfe_trafo2000 + getJumlahTrafo2500() * lfe_trafo2500)
                    / jumlahTrafo();
        }
    }

    public double lcuEq() {
        if (jumlahTrafo() == 0) {
            return 0.0;
        } else {
            return (getJumlahTrafo25() * lcu_trafo25 + getJumlahTrafo50() * lcu_trafo50
                    + getJumlahTrafo100() * lcu_trafo100 + getJumlahTrafo160() * lcu_trafo160
                    + getJumlahTrafo200() * lcu_trafo200 + getJumlahTrafo250() * lcu_trafo250
                    + getJumlahTrafo315() * lcu_trafo315 + getJumlahTrafo400() * lcu_trafo400
                    + getJumlahTrafo500() * lcu_trafo500 + getJumlahTrafo630() * lcu_trafo630
                    + getJumlahTrafo800() * lcu_trafo800 + getJumlahTrafo1000() * lcu_trafo1000
                    + getJumlahTrafo1250() * lcu_trafo1250 + getJumlahTrafo1600() * lcu_trafo1600
                    + getJumlahTrafo2000() * lcu_trafo2000 + getJumlahTrafo2500() * lcu_trafo2500)
                    / jumlahTrafo();
        }
    }

    public double rEqSr() {
        if (panjangSr() == 0) {
            return 0.0;
        } else {
            return rTotalSr() / panjangSr();
        }
    }

    public double rTotalSr() {
        return (getPanjangSrCu6() * k_SRCu6 + getPanjangSrCu10() * k_SRCu10
                + getPanjangSrCu16() * k_SRCu16 + getPanjangSrAl10() * k_SRAl10
                + getPanjangSrAl16() * k_SRAl16);
    }

    public int panjangSr() {
        return getPanjangSrCu6() + getPanjangSrCu10() + getPanjangSrCu16() + getPanjangSrAl10()
                + getPanjangSrAl16();
    }

    public double rEqTr() {
        if (panjangSutr() == 0) {
            return 0.0;
        } else {
            return rTotalSutr() / panjangSutr();
        }
    }

    public double rTotalSutr() {
        return getPanjangSutrCu6() * k_TRCu6
                + getPanjangSutrCu10() * k_TRCu10
                + getPanjangSutrCu16() * k_TRCu16
                + getPanjangSutrCu25() * k_TRCu25
                + getPanjangSutrCu35() * k_TRCu35
                + getPanjangSutrCu50() * k_TRCu50
                + getPanjangSutrCu70() * k_TRCu70
                + getPanjangSutrCu95() * k_TRCu95
                + getPanjangSutrCu110() * k_TRCu110
                + getPanjangSutrCu120() * k_TRCu120
                + getPanjangSutrCu150() * k_TRCu150
                + getPanjangSutrCu185() * k_TRCu185
                + getPanjangSutrCu240() * k_TRCu240
                + getPanjangSutrCu300() * k_TRCu300
                + getPanjangSutrCu400() * k_TRCu400
                + getPanjangSutrCu500() * k_TRCu500
                + getPanjangSutrAl16() * k_TRAl16
                + getPanjangSutrAl25() * k_TRAl25
                + getPanjangSutrAl35() * k_TRAl35
                + getPanjangSutrAl50() * k_TRAl50
                + getPanjangSutrAl70() * k_TRAl70
                + getPanjangSutrAl95() * k_TRAl95
                + getPanjangSutrAl100() * k_TRAl100
                + getPanjangSutrAl120() * k_TRAl120
                + getPanjangSutrAl150() * k_TRAl150
                + getPanjangSutrAl185() * k_TRAl185
                + getPanjangSutrAl240() * k_TRAl240
                + getPanjangSutrAl300() * k_TRAl300
                + getPanjangSutrAl400() * k_TRAl400
                + getPanjangSutrAl500() * k_TRAl500;
    }

    public int panjangSutr() {
        return panjangSutrAl() + panjangSutrCu();
    }

    public int panjangSutrAl() {
        return getPanjangSutrAl16() + getPanjangSutrAl25() + getPanjangSutrAl35() + getPanjangSutrAl50()
                + getPanjangSutrAl70() + getPanjangSutrAl95() + getPanjangSutrAl100() + getPanjangSutrAl120()
                + getPanjangSutrAl150() + getPanjangSutrAl185() + getPanjangSutrAl240()
                + getPanjangSutrAl300() + getPanjangSutrAl400() + getPanjangSutrAl500();
    }

    public int panjangSutrCu() {
        return getPanjangSutrCu6() + getPanjangSutrCu10() + getPanjangSutrCu16() + getPanjangSutrCu25() + getPanjangSutrCu35() + getPanjangSutrCu50()
                + getPanjangSutrCu70() + getPanjangSutrCu95() + getPanjangSutrCu110() + getPanjangSutrCu120()
                + getPanjangSutrCu150() + getPanjangSutrCu185() + getPanjangSutrCu240()
                + getPanjangSutrCu300() + getPanjangSutrCu400() + getPanjangSutrCu500();
    }

    public double rEqTm() {
        if (panjangSutm() == 0) {
            return 0.0;
        } else {
            return rTotalSutm() / panjangSutm();
        }
    }

    public int panjangSutm() {
        return panjangSutmAl() + panjangSutmCu() + panjangSktm();
    }

    public int panjangSutmAl() {
        return getPanjangSutmAl16() + getPanjangSutmAl25() + getPanjangSutmAl35() + getPanjangSutmAl50()
                + getPanjangSutmAl70() + getPanjangSutmAl95() + getPanjangSutmAl100() + getPanjangSutmAl120()
                + getPanjangSutmAl150() + getPanjangSutmAl185() + getPanjangSutmAl240()
                + getPanjangSutmAl300() + getPanjangSutmAl400() + getPanjangSutmAl500();
    }

    public int panjangSutmCu() {
        return getPanjangSutmCu16() + getPanjangSutmCu25() + getPanjangSutmCu35() + getPanjangSutmCu50()
                + getPanjangSutmCu70() + getPanjangSutmCu95() + getPanjangSutmCu110() + getPanjangSutmCu120()
                + getPanjangSutmCu150() + getPanjangSutmCu185() + getPanjangSutmCu240()
                + getPanjangSutmCu300() + getPanjangSutmCu400() + getPanjangSutmCu500();
    }

    public double rTotalSutm() {
        return (getPanjangSutmCu16() * k_SUTMCu16
                + getPanjangSutmCu25() * k_SUTMCu25
                + getPanjangSutmCu35() * k_SUTMCu35
                + getPanjangSutmCu50() * k_SUTMCu50
                + getPanjangSutmCu70() * k_SUTMCu70
                + getPanjangSutmCu95() * k_SUTMCu95
                + getPanjangSutmCu110() * k_SUTMCu110
                + getPanjangSutmCu120() * k_SUTMCu120
                + getPanjangSutmCu150() * k_SUTMCu150
                + getPanjangSutmCu185() * k_SUTMCu185
                + getPanjangSutmCu240() * k_SUTMCu240
                + getPanjangSutmCu300() * k_SUTMCu300
                + getPanjangSutmCu400() * k_SUTMCu400
                + getPanjangSutmCu500() * k_SUTMCu500
                + getPanjangSutmAl16() * k_SUTMAl16
                + getPanjangSutmAl25() * k_SUTMAl25
                + getPanjangSutmAl35() * k_SUTMAl35
                + getPanjangSutmAl50() * k_SUTMAl50
                + getPanjangSutmAl70() * k_SUTMAl70
                + getPanjangSutmAl95() * k_SUTMAl95
                + getPanjangSutmAl100() * k_SUTMAl100
                + getPanjangSutmAl120() * k_SUTMAl120
                + getPanjangSutmAl150() * k_SUTMAl150
                + getPanjangSutmAl185() * k_SUTMAl185
                + getPanjangSutmAl240() * k_SUTMAl240
                + getPanjangSutmAl300() * k_SUTMAl300
                + getPanjangSutmAl400() * k_SUTMAl400
                + getPanjangSutmAl500() * k_SUTMAl500
                + rTotalSktm());
    }

    public double rTotalSktm() {
        return (getPanjangSktmCu16() * k_SKTMCu16
                + getPanjangSktmCu25() * k_SKTMCu25
                + getPanjangSktmCu35() * k_SKTMCu35
                + getPanjangSktmCu50() * k_SKTMCu50
                + getPanjangSktmCu70() * k_SKTMCu70
                + getPanjangSktmCu90() * k_SKTMCu90
                + getPanjangSktmCu120() * k_SKTMCu120
                + getPanjangSktmCu150() * k_SKTMCu150
                + getPanjangSktmCu185() * k_SKTMCu185
                + getPanjangSktmCu240() * k_SKTMCu240
                + getPanjangSktmCu300() * k_SKTMCu300
                + getPanjangSktmCu400() * k_SKTMCu400
                + getPanjangSktmAl16() * k_SKTMAl16
                + getPanjangSktmAl25() * k_SKTMAl25
                + getPanjangSktmAl35() * k_SKTMAl35
                + getPanjangSktmAl50() * k_SKTMAl50
                + getPanjangSktmAl70() * k_SKTMAl70
                + getPanjangSktmAl90() * k_SKTMAl90
                + getPanjangSktmAl120() * k_SKTMAl120
                + getPanjangSktmAl150() * k_SKTMAl150
                + getPanjangSktmAl185() * k_SKTMAl185
                + getPanjangSktmAl240() * k_SKTMAl240
                + getPanjangSktmAl300() * k_SKTMAl300
                + getPanjangSktmAl400() * k_SKTMAl400);
    }

    public int panjangSktm() {
        return panjangSktmAl() + panjangSktmCu();
    }

    public int panjangSktmAl() {
        return getPanjangSktmAl16() + getPanjangSktmAl25() + getPanjangSktmAl35() + getPanjangSktmAl50()
                + getPanjangSktmAl70() + getPanjangSktmAl90() + getPanjangSktmAl120()
                + getPanjangSktmAl150() + getPanjangSktmAl185() + getPanjangSktmAl240()
                + getPanjangSktmAl300() + getPanjangSktmAl400();
    }

    public int panjangSktmCu() {
        return getPanjangSktmCu16() + getPanjangSktmCu25() + getPanjangSktmCu35() + getPanjangSktmCu50()
                + getPanjangSktmCu70() + getPanjangSktmCu90() + getPanjangSktmCu120()
                + getPanjangSktmCu150() + getPanjangSktmCu185() + getPanjangSktmCu240()
                + getPanjangSktmCu300() + getPanjangSktmCu400();
    }

    /**
     * @return the LF_Trafo
     */
    public double getLF_Trafo() {
        return LF_Trafo;
    }

    /**
     * @param LF_Trafo the LF_Trafo to set
     */
    public void setLF_Trafo(double LF_Trafo) {
        this.LF_Trafo = LF_Trafo;
    }

    /**
     * @return the LF_TM
     */
    public double getLF_TM() {
        return LF_TM;
    }

    /**
     * @param LF_TM the LF_TM to set
     */
    public void setLF_TM(double LF_TM) {
        this.LF_TM = LF_TM;
    }

    /**
     * @return the LF_TR
     */
    public double getLF_TR() {
        return LF_TR;
    }

    /**
     * @param LF_TR the LF_TR to set
     */
    public void setLF_TR(double LF_TR) {
        this.LF_TR = LF_TR;
    }

    /**
     * @return the LF_SR
     */
    public double getLF_SR() {
        return LF_SR;
    }

    /**
     * @param LF_SR the LF_SR to set
     */
    public void setLF_SR(double LF_SR) {
        this.LF_SR = LF_SR;
    }

    /**
     * @return the cos_TM
     */
    public double getCos_TM() {
        return cos_TM;
    }

    /**
     * @param cos_TM the cos_TM to set
     */
    public void setCos_TM(double cos_TM) {
        this.cos_TM = cos_TM;
    }

    /**
     * @return the cos_Trafo
     */
    public double getCos_Trafo() {
        return cos_Trafo;
    }

    /**
     * @param cos_Trafo the cos_Trafo to set
     */
    public void setCos_Trafo(double cos_Trafo) {
        this.cos_Trafo = cos_Trafo;
    }

    /**
     * @return the cos_TR
     */
    public double getCos_TR() {
        return cos_TR;
    }

    /**
     * @param cos_TR the cos_TR to set
     */
    public void setCos_TR(double cos_TR) {
        this.cos_TR = cos_TR;
    }

    /**
     * @return the cos_SR
     */
    public double getCos_SR() {
        return cos_SR;
    }

    /**
     * @param cos_SR the cos_SR to set
     */
    public void setCos_SR(double cos_SR) {
        this.cos_SR = cos_SR;
    }

    /**
     * @return the periodePerhitungan
     */
    public int getPeriodePerhitungan() {
        return periodePerhitungan;
    }

    /**
     * @param periodePerhitungan the periodePerhitungan to set
     */
    public void setPeriodePerhitungan(int periodePerhitungan) {
        this.periodePerhitungan = periodePerhitungan;
    }

    /**
     * @return the jumlahJurusan
     */
    public int getJumlahJurusan() {
        return jumlahJurusan;
    }

    /**
     * @param jumlahJurusan the jumlahJurusan to set
     */
    public void setJumlahJurusan(int jumlahJurusan) {
        this.jumlahJurusan = jumlahJurusan;
    }

    /**
     * @return the jumlahPelanggan
     */
    public int getJumlahPelanggan() {
        return jumlahPelanggan;
    }

    /**
     * @param jumlahPelanggan the jumlahPelanggan to set
     */
    public void setJumlahPelanggan(int jumlahPelanggan) {
        this.jumlahPelanggan = jumlahPelanggan;
    }

    /**
     * @return the jumlahPenyulang
     */
    public int getJumlahPenyulang() {
        return jumlahPenyulang;
    }

    /**
     * @param jumlahPenyulang the jumlahPenyulang to set
     */
    public void setJumlahPenyulang(int jumlahPenyulang) {
        this.jumlahPenyulang = jumlahPenyulang;
    }

    /**
     * @return the penerimaan
     */
    public long getPenerimaan() {
        return penerimaan;
    }

    /**
     * @param penerimaan the penerimaan to set
     */
    public void setPenerimaan(long penerimaan) {
        this.penerimaan = penerimaan;
    }

    /**
     * @return the penjualanTotal
     */
    public long getPenjualanTotal() {
        return penjualanTotal;
    }

    /**
     * @param penjualanTotal the penjualanTotal to set
     */
    public void setPenjualanTotal(long penjualanTotal) {
        this.penjualanTotal = penjualanTotal;
    }

    /**
     * @return the penjualan_TM
     */
    public long getPenjualan_TM() {
        return penjualan_TM;
    }

    /**
     * @param penjualan_TM the penjualan_TM to set
     */
    public void setPenjualan_TM(long penjualan_TM) {
        this.penjualan_TM = penjualan_TM;
    }

    /**
     * @return the penjualan_TT
     */
    public long getPenjualan_TT() {
        return penjualan_TT;
    }

    /**
     * @param penjualan_TT the penjualan_TT to set
     */
    public void setPenjualan_TT(long penjualan_TT) {
        this.penjualan_TT = penjualan_TT;
    }

    /**
     * @return the ps_gd
     */
    public long getPs_gd() {
        return ps_gd;
    }

    /**
     * @param ps_gd the ps_gd to set
     */
    public void setPs_gd(long ps_gd) {
        this.ps_gd = ps_gd;
    }

    /**
     * @return the k_SKTMCu16
     */
    public double getK_SKTMCu16() {
        return k_SKTMCu16;
    }

    /**
     * @return the k_SKTMCu25
     */
    public double getK_SKTMCu25() {
        return k_SKTMCu25;
    }

    /**
     * @return the k_SKTMCu35
     */
    public double getK_SKTMCu35() {
        return k_SKTMCu35;
    }

    /**
     * @return the k_SKTMCu50
     */
    public double getK_SKTMCu50() {
        return k_SKTMCu50;
    }

    /**
     * @return the k_SKTMCu70
     */
    public double getK_SKTMCu70() {
        return k_SKTMCu70;
    }

    /**
     * @return the k_SKTMCu90
     */
    public double getK_SKTMCu90() {
        return k_SKTMCu90;
    }

    /**
     * @return the k_SKTMCu120
     */
    public double getK_SKTMCu120() {
        return k_SKTMCu120;
    }

    /**
     * @return the k_SKTMCu150
     */
    public double getK_SKTMCu150() {
        return k_SKTMCu150;
    }

    /**
     * @return the k_SKTMCu185
     */
    public double getK_SKTMCu185() {
        return k_SKTMCu185;
    }

    /**
     * @return the k_SKTMCu240
     */
    public double getK_SKTMCu240() {
        return k_SKTMCu240;
    }

    /**
     * @return the k_SKTMCu300
     */
    public double getK_SKTMCu300() {
        return k_SKTMCu300;
    }

    /**
     * @return the k_SKTMCu400
     */
    public double getK_SKTMCu400() {
        return k_SKTMCu400;
    }

    /**
     * @return the k_SKTMAl16
     */
    public double getK_SKTMAl16() {
        return k_SKTMAl16;
    }

    /**
     * @return the k_SKTMAl25
     */
    public double getK_SKTMAl25() {
        return k_SKTMAl25;
    }

    /**
     * @return the k_SKTMAl35
     */
    public double getK_SKTMAl35() {
        return k_SKTMAl35;
    }

    /**
     * @return the k_SKTMAl50
     */
    public double getK_SKTMAl50() {
        return k_SKTMAl50;
    }

    /**
     * @return the k_SKTMAl70
     */
    public double getK_SKTMAl70() {
        return k_SKTMAl70;
    }

    /**
     * @return the k_SKTMAl90
     */
    public double getK_SKTMAl90() {
        return k_SKTMAl90;
    }

    /**
     * @return the k_SKTMAl120
     */
    public double getK_SKTMAl120() {
        return k_SKTMAl120;
    }

    /**
     * @return the k_SKTMAl150
     */
    public double getK_SKTMAl150() {
        return k_SKTMAl150;
    }

    /**
     * @return the k_SKTMAl185
     */
    public double getK_SKTMAl185() {
        return k_SKTMAl185;
    }

    /**
     * @return the k_SKTMAl240
     */
    public double getK_SKTMAl240() {
        return k_SKTMAl240;
    }

    /**
     * @return the k_SKTMAl300
     */
    public double getK_SKTMAl300() {
        return k_SKTMAl300;
    }

    /**
     * @return the k_SKTMAl400
     */
    public double getK_SKTMAl400() {
        return k_SKTMAl400;
    }

    /**
     * @return the k_SUTMCu16
     */
    public double getK_SUTMCu16() {
        return k_SUTMCu16;
    }

    /**
     * @return the k_SUTMCu25
     */
    public double getK_SUTMCu25() {
        return k_SUTMCu25;
    }

    /**
     * @return the k_SUTMCu35
     */
    public double getK_SUTMCu35() {
        return k_SUTMCu35;
    }

    /**
     * @return the k_SUTMCu50
     */
    public double getK_SUTMCu50() {
        return k_SUTMCu50;
    }

    /**
     * @return the k_SUTMCu70
     */
    public double getK_SUTMCu70() {
        return k_SUTMCu70;
    }

    /**
     * @return the k_SUTMCu95
     */
    public double getK_SUTMCu95() {
        return k_SUTMCu95;
    }

    /**
     * @return the k_SUTMCu110
     */
    public double getK_SUTMCu110() {
        return k_SUTMCu110;
    }

    /**
     * @return the k_SUTMCu120
     */
    public double getK_SUTMCu120() {
        return k_SUTMCu120;
    }

    /**
     * @return the k_SUTMCu150
     */
    public double getK_SUTMCu150() {
        return k_SUTMCu150;
    }

    /**
     * @return the k_SUTMCu185
     */
    public double getK_SUTMCu185() {
        return k_SUTMCu185;
    }

    /**
     * @return the k_SUTMCu240
     */
    public double getK_SUTMCu240() {
        return k_SUTMCu240;
    }

    /**
     * @return the k_SUTMCu300
     */
    public double getK_SUTMCu300() {
        return k_SUTMCu300;
    }

    /**
     * @return the k_SUTMCu400
     */
    public double getK_SUTMCu400() {
        return k_SUTMCu400;
    }

    /**
     * @return the k_SUTMCu500
     */
    public double getK_SUTMCu500() {
        return k_SUTMCu500;
    }

    /**
     * @return the k_SUTMAl16
     */
    public double getK_SUTMAl16() {
        return k_SUTMAl16;
    }

    /**
     * @return the k_SUTMAl25
     */
    public double getK_SUTMAl25() {
        return k_SUTMAl25;
    }

    /**
     * @return the k_SUTMAl35
     */
    public double getK_SUTMAl35() {
        return k_SUTMAl35;
    }

    /**
     * @return the k_SUTMAl50
     */
    public double getK_SUTMAl50() {
        return k_SUTMAl50;
    }

    /**
     * @return the k_SUTMAl70
     */
    public double getK_SUTMAl70() {
        return k_SUTMAl70;
    }

    /**
     * @return the k_SUTMAl95
     */
    public double getK_SUTMAl95() {
        return k_SUTMAl95;
    }

    /**
     * @return the k_SUTMAl100
     */
    public double getK_SUTMAl100() {
        return k_SUTMAl100;
    }

    /**
     * @return the k_SUTMAl120
     */
    public double getK_SUTMAl120() {
        return k_SUTMAl120;
    }

    /**
     * @return the k_SUTMAl150
     */
    public double getK_SUTMAl150() {
        return k_SUTMAl150;
    }

    /**
     * @return the k_SUTMAl185
     */
    public double getK_SUTMAl185() {
        return k_SUTMAl185;
    }

    /**
     * @return the k_SUTMAl240
     */
    public double getK_SUTMAl240() {
        return k_SUTMAl240;
    }

    /**
     * @return the k_SUTMAl300
     */
    public double getK_SUTMAl300() {
        return k_SUTMAl300;
    }

    /**
     * @return the k_SUTMAl400
     */
    public double getK_SUTMAl400() {
        return k_SUTMAl400;
    }

    /**
     * @return the k_SUTMAl500
     */
    public double getK_SUTMAl500() {
        return k_SUTMAl500;
    }

    /**
     * @return the k_TRCu6
     */
    public double getK_TRCu6() {
        return k_TRCu6;
    }

    /**
     * @return the k_TRCu10
     */
    public double getK_TRCu10() {
        return k_TRCu10;
    }

    /**
     * @return the k_TRCu16
     */
    public double getK_TRCu16() {
        return k_TRCu16;
    }

    /**
     * @return the k_TRCu25
     */
    public double getK_TRCu25() {
        return k_TRCu25;
    }

    /**
     * @return the k_TRCu35
     */
    public double getK_TRCu35() {
        return k_TRCu35;
    }

    /**
     * @return the k_TRCu50
     */
    public double getK_TRCu50() {
        return k_TRCu50;
    }

    /**
     * @return the k_TRCu70
     */
    public double getK_TRCu70() {
        return k_TRCu70;
    }

    /**
     * @return the k_TRCu95
     */
    public double getK_TRCu95() {
        return k_TRCu95;
    }

    /**
     * @return the k_TRCu110
     */
    public double getK_TRCu110() {
        return k_TRCu110;
    }

    /**
     * @return the k_TRCu120
     */
    public double getK_TRCu120() {
        return k_TRCu120;
    }

    /**
     * @return the k_TRCu150
     */
    public double getK_TRCu150() {
        return k_TRCu150;
    }

    /**
     * @return the k_TRCu185
     */
    public double getK_TRCu185() {
        return k_TRCu185;
    }

    /**
     * @return the k_TRCu240
     */
    public double getK_TRCu240() {
        return k_TRCu240;
    }

    /**
     * @return the k_TRCu300
     */
    public double getK_TRCu300() {
        return k_TRCu300;
    }

    /**
     * @return the k_TRCu400
     */
    public double getK_TRCu400() {
        return k_TRCu400;
    }

    /**
     * @return the k_TRCu500
     */
    public double getK_TRCu500() {
        return k_TRCu500;
    }

    /**
     * @return the k_TRAl16
     */
    public double getK_TRAl16() {
        return k_TRAl16;
    }

    /**
     * @return the k_TRAl25
     */
    public double getK_TRAl25() {
        return k_TRAl25;
    }

    /**
     * @return the k_TRAl35
     */
    public double getK_TRAl35() {
        return k_TRAl35;
    }

    /**
     * @return the k_TRAl50
     */
    public double getK_TRAl50() {
        return k_TRAl50;
    }

    /**
     * @return the k_TRAl70
     */
    public double getK_TRAl70() {
        return k_TRAl70;
    }

    /**
     * @return the k_TRAl95
     */
    public double getK_TRAl95() {
        return k_TRAl95;
    }

    /**
     * @return the k_TRAl100
     */
    public double getK_TRAl100() {
        return k_TRAl100;
    }

    /**
     * @return the k_TRAl120
     */
    public double getK_TRAl120() {
        return k_TRAl120;
    }

    /**
     * @return the k_TRAl150
     */
    public double getK_TRAl150() {
        return k_TRAl150;
    }

    /**
     * @return the k_TRAl185
     */
    public double getK_TRAl185() {
        return k_TRAl185;
    }

    /**
     * @return the k_TRAl240
     */
    public double getK_TRAl240() {
        return k_TRAl240;
    }

    /**
     * @return the k_TRAl300
     */
    public double getK_TRAl300() {
        return k_TRAl300;
    }

    /**
     * @return the k_TRAl400
     */
    public double getK_TRAl400() {
        return k_TRAl400;
    }

    /**
     * @return the k_TRAl500
     */
    public double getK_TRAl500() {
        return k_TRAl500;
    }

    /**
     * @return the k_SRCu6
     */
    public double getK_SRCu6() {
        return k_SRCu6;
    }

    /**
     * @return the k_SRCu10
     */
    public double getK_SRCu10() {
        return k_SRCu10;
    }

    /**
     * @return the k_SRCu16
     */
    public double getK_SRCu16() {
        return k_SRCu16;
    }

    /**
     * @return the k_SRAl10
     */
    public double getK_SRAl10() {
        return k_SRAl10;
    }

    /**
     * @return the k_SRAl16
     */
    public double getK_SRAl16() {
        return k_SRAl16;
    }

    /**
     * @return the lfe_trafo25
     */
    public double getLfe_trafo25() {
        return lfe_trafo25;
    }

    /**
     * @return the lfe_trafo50
     */
    public double getLfe_trafo50() {
        return lfe_trafo50;
    }

    /**
     * @return the lfe_trafo100
     */
    public double getLfe_trafo100() {
        return lfe_trafo100;
    }

    /**
     * @return the lfe_trafo160
     */
    public double getLfe_trafo160() {
        return lfe_trafo160;
    }

    /**
     * @return the lfe_trafo200
     */
    public double getLfe_trafo200() {
        return lfe_trafo200;
    }

    /**
     * @return the lfe_trafo250
     */
    public double getLfe_trafo250() {
        return lfe_trafo250;
    }

    /**
     * @return the lfe_trafo315
     */
    public double getLfe_trafo315() {
        return lfe_trafo315;
    }

    /**
     * @return the lfe_trafo400
     */
    public double getLfe_trafo400() {
        return lfe_trafo400;
    }

    /**
     * @return the lfe_trafo500
     */
    public double getLfe_trafo500() {
        return lfe_trafo500;
    }

    /**
     * @return the lfe_trafo630
     */
    public double getLfe_trafo630() {
        return lfe_trafo630;
    }

    /**
     * @return the lfe_trafo800
     */
    public double getLfe_trafo800() {
        return lfe_trafo800;
    }

    /**
     * @return the lfe_trafo1000
     */
    public double getLfe_trafo1000() {
        return lfe_trafo1000;
    }

    /**
     * @return the lfe_trafo1250
     */
    public double getLfe_trafo1250() {
        return lfe_trafo1250;
    }

    /**
     * @return the lfe_trafo1600
     */
    public double getLfe_trafo1600() {
        return lfe_trafo1600;
    }

    /**
     * @return the lfe_trafo2000
     */
    public double getLfe_trafo2000() {
        return lfe_trafo2000;
    }

    /**
     * @return the lfe_trafo2500
     */
    public double getLfe_trafo2500() {
        return lfe_trafo2500;
    }

    /**
     * @return the lcu_trafo25
     */
    public double getLcu_trafo25() {
        return lcu_trafo25;
    }

    /**
     * @return the lcu_trafo50
     */
    public double getLcu_trafo50() {
        return lcu_trafo50;
    }

    /**
     * @return the lcu_trafo100
     */
    public double getLcu_trafo100() {
        return lcu_trafo100;
    }

    /**
     * @return the lcu_trafo160
     */
    public double getLcu_trafo160() {
        return lcu_trafo160;
    }

    /**
     * @return the lcu_trafo200
     */
    public double getLcu_trafo200() {
        return lcu_trafo200;
    }

    /**
     * @return the lcu_trafo250
     */
    public double getLcu_trafo250() {
        return lcu_trafo250;
    }

    /**
     * @return the lcu_trafo315
     */
    public double getLcu_trafo315() {
        return lcu_trafo315;
    }

    /**
     * @return the lcu_trafo400
     */
    public double getLcu_trafo400() {
        return lcu_trafo400;
    }

    /**
     * @return the lcu_trafo500
     */
    public double getLcu_trafo500() {
        return lcu_trafo500;
    }

    /**
     * @return the lcu_trafo630
     */
    public double getLcu_trafo630() {
        return lcu_trafo630;
    }

    /**
     * @return the lcu_trafo800
     */
    public double getLcu_trafo800() {
        return lcu_trafo800;
    }

    /**
     * @return the lcu_trafo1000
     */
    public double getLcu_trafo1000() {
        return lcu_trafo1000;
    }

    /**
     * @return the lcu_trafo1250
     */
    public double getLcu_trafo1250() {
        return lcu_trafo1250;
    }

    /**
     * @return the lcu_trafo1600
     */
    public double getLcu_trafo1600() {
        return lcu_trafo1600;
    }

    /**
     * @return the lcu_trafo2000
     */
    public double getLcu_trafo2000() {
        return lcu_trafo2000;
    }

    /**
     * @return the lcu_trafo2500
     */
    public double getLcu_trafo2500() {
        return lcu_trafo2500;
    }

    private void setEmpty() {
        setCos_TM(0.0);
        setCos_Trafo(0.0);
        setCos_TR(0.0);
        setCos_SR(0.0);
        setLF_TM(0.0);
        setLF_Trafo(0.0);
        setLF_TR(0.0);
        setLF_SR(0.0);
        setPeriodePerhitungan(0);
        setJumlahPelanggan(0);
        setJumlahPenyulang(0);
        setJumlahJurusan(0);
        setPenerimaan(0);
        setPenjualanTotal(0);
        setPenjualan_TM(0);
        setPenjualan_TT(0);
        setPs_gd(0);
        setPanjangSktmCu16(0);
        setPanjangSktmCu25(0);
        setPanjangSktmCu35(0);
        setPanjangSktmCu50(0);
        setPanjangSktmCu70(0);
        setPanjangSktmCu90(0);
        setPanjangSktmCu120(0);
        setPanjangSktmCu150(0);
        setPanjangSktmCu185(0);
        setPanjangSktmCu240(0);
        setPanjangSktmCu300(0);
        setPanjangSktmCu400(0);
        setPanjangSktmAl16(0);
        setPanjangSktmAl25(0);
        setPanjangSktmAl35(0);
        setPanjangSktmAl50(0);
        setPanjangSktmAl70(0);
        setPanjangSktmAl90(0);
        setPanjangSktmAl120(0);
        setPanjangSktmAl150(0);
        setPanjangSktmAl185(0);
        setPanjangSktmAl240(0);
        setPanjangSktmAl300(0);
        setPanjangSktmAl400(0);
        setPanjangSutmCu16(0);
        setPanjangSutmCu25(0);
        setPanjangSutmCu35(0);
        setPanjangSutmCu50(0);
        setPanjangSutmCu70(0);
        setPanjangSutmCu95(0);
        setPanjangSutmCu110(0);
        setPanjangSutmCu120(0);
        setPanjangSutmCu150(0);
        setPanjangSutmCu185(0);
        setPanjangSutmCu240(0);
        setPanjangSutmCu300(0);
        setPanjangSutmCu400(0);
        setPanjangSutmCu500(0);
        setPanjangSutmAl16(0);
        setPanjangSutmAl25(0);
        setPanjangSutmAl35(0);
        setPanjangSutmAl50(0);
        setPanjangSutmAl70(0);
        setPanjangSutmAl95(0);
        setPanjangSutmAl100(0);
        setPanjangSutmAl120(0);
        setPanjangSutmAl150(0);
        setPanjangSutmAl185(0);
        setPanjangSutmAl240(0);
        setPanjangSutmAl300(0);
        setPanjangSutmAl400(0);
        setPanjangSutmAl500(0);
        setPanjangSutrCu6(0);
        setPanjangSutrCu10(0);
        setPanjangSutrCu16(0);
        setPanjangSutrCu25(0);
        setPanjangSutrCu35(0);
        setPanjangSutrCu50(0);
        setPanjangSutrCu70(0);
        setPanjangSutrCu95(0);
        setPanjangSutrCu110(0);
        setPanjangSutrCu120(0);
        setPanjangSutrCu150(0);
        setPanjangSutrCu185(0);
        setPanjangSutrCu240(0);
        setPanjangSutrCu300(0);
        setPanjangSutrCu400(0);
        setPanjangSutrCu500(0);
        setPanjangSutrAl16(0);
        setPanjangSutrAl25(0);
        setPanjangSutrAl35(0);
        setPanjangSutrAl50(0);
        setPanjangSutrAl70(0);
        setPanjangSutrAl95(0);
        setPanjangSutrAl100(0);
        setPanjangSutrAl120(0);
        setPanjangSutrAl150(0);
        setPanjangSutrAl185(0);
        setPanjangSutrAl240(0);
        setPanjangSutrAl300(0);
        setPanjangSutrAl400(0);
        setPanjangSutrAl500(0);
        setPanjangSrCu6(0);
        setPanjangSrCu10(0);
        setPanjangSrCu16(0);
        setPanjangSrAl10(0);
        setPanjangSrAl16(0);
        setJumlahTrafo25(0);
        setJumlahTrafo50(0);
        setJumlahTrafo100(0);
        setJumlahTrafo160(0);
        setJumlahTrafo200(0);
        setJumlahTrafo250(0);
        setJumlahTrafo315(0);
        setJumlahTrafo400(0);
        setJumlahTrafo500(0);
        setJumlahTrafo630(0);
        setJumlahTrafo800(0);
        setJumlahTrafo1000(0);
        setJumlahTrafo1250(0);
        setJumlahTrafo1600(0);
        setJumlahTrafo2000(0);
        setJumlahTrafo2500(0);
    }

    /**
     * @return the panjangSktmCu16
     */
    public int getPanjangSktmCu16() {
        return panjangSktmCu16;
    }

    /**
     * @param panjangSktmCu16 the panjangSktmCu16 to set
     */
    public void setPanjangSktmCu16(int panjangSktmCu16) {
        this.panjangSktmCu16 = panjangSktmCu16;
    }

    /**
     * @return the panjangSktmCu25
     */
    public int getPanjangSktmCu25() {
        return panjangSktmCu25;
    }

    /**
     * @param panjangSktmCu25 the panjangSktmCu25 to set
     */
    public void setPanjangSktmCu25(int panjangSktmCu25) {
        this.panjangSktmCu25 = panjangSktmCu25;
    }

    /**
     * @return the panjangSktmCu35
     */
    public int getPanjangSktmCu35() {
        return panjangSktmCu35;
    }

    /**
     * @param panjangSktmCu35 the panjangSktmCu35 to set
     */
    public void setPanjangSktmCu35(int panjangSktmCu35) {
        this.panjangSktmCu35 = panjangSktmCu35;
    }

    /**
     * @return the panjangSktmCu50
     */
    public int getPanjangSktmCu50() {
        return panjangSktmCu50;
    }

    /**
     * @param panjangSktmCu50 the panjangSktmCu50 to set
     */
    public void setPanjangSktmCu50(int panjangSktmCu50) {
        this.panjangSktmCu50 = panjangSktmCu50;
    }

    /**
     * @return the panjangSktmCu70
     */
    public int getPanjangSktmCu70() {
        return panjangSktmCu70;
    }

    /**
     * @param panjangSktmCu70 the panjangSktmCu70 to set
     */
    public void setPanjangSktmCu70(int panjangSktmCu70) {
        this.panjangSktmCu70 = panjangSktmCu70;
    }

    /**
     * @return the panjangSktmCu90
     */
    public int getPanjangSktmCu90() {
        return panjangSktmCu90;
    }

    /**
     * @param panjangSktmCu90 the panjangSktmCu90 to set
     */
    public void setPanjangSktmCu90(int panjangSktmCu90) {
        this.panjangSktmCu90 = panjangSktmCu90;
    }

    /**
     * @return the panjangSktmCu120
     */
    public int getPanjangSktmCu120() {
        return panjangSktmCu120;
    }

    /**
     * @param panjangSktmCu120 the panjangSktmCu120 to set
     */
    public void setPanjangSktmCu120(int panjangSktmCu120) {
        this.panjangSktmCu120 = panjangSktmCu120;
    }

    /**
     * @return the panjangSktmCu150
     */
    public int getPanjangSktmCu150() {
        return panjangSktmCu150;
    }

    /**
     * @param panjangSktmCu150 the panjangSktmCu150 to set
     */
    public void setPanjangSktmCu150(int panjangSktmCu150) {
        this.panjangSktmCu150 = panjangSktmCu150;
    }

    /**
     * @return the panjangSktmCu185
     */
    public int getPanjangSktmCu185() {
        return panjangSktmCu185;
    }

    /**
     * @param panjangSktmCu185 the panjangSktmCu185 to set
     */
    public void setPanjangSktmCu185(int panjangSktmCu185) {
        this.panjangSktmCu185 = panjangSktmCu185;
    }

    /**
     * @return the panjangSktmCu240
     */
    public int getPanjangSktmCu240() {
        return panjangSktmCu240;
    }

    /**
     * @param panjangSktmCu240 the panjangSktmCu240 to set
     */
    public void setPanjangSktmCu240(int panjangSktmCu240) {
        this.panjangSktmCu240 = panjangSktmCu240;
    }

    /**
     * @return the panjangSktmCu300
     */
    public int getPanjangSktmCu300() {
        return panjangSktmCu300;
    }

    /**
     * @param panjangSktmCu300 the panjangSktmCu300 to set
     */
    public void setPanjangSktmCu300(int panjangSktmCu300) {
        this.panjangSktmCu300 = panjangSktmCu300;
    }

    /**
     * @return the panjangSktmCu400
     */
    public int getPanjangSktmCu400() {
        return panjangSktmCu400;
    }

    /**
     * @param panjangSktmCu400 the panjangSktmCu400 to set
     */
    public void setPanjangSktmCu400(int panjangSktmCu400) {
        this.panjangSktmCu400 = panjangSktmCu400;
    }

    /**
     * @return the panjangSktmAl16
     */
    public int getPanjangSktmAl16() {
        return panjangSktmAl16;
    }

    /**
     * @param panjangSktmAl16 the panjangSktmAl16 to set
     */
    public void setPanjangSktmAl16(int panjangSktmAl16) {
        this.panjangSktmAl16 = panjangSktmAl16;
    }

    /**
     * @return the panjangSktmAl25
     */
    public int getPanjangSktmAl25() {
        return panjangSktmAl25;
    }

    /**
     * @param panjangSktmAl25 the panjangSktmAl25 to set
     */
    public void setPanjangSktmAl25(int panjangSktmAl25) {
        this.panjangSktmAl25 = panjangSktmAl25;
    }

    /**
     * @return the panjangSktmAl35
     */
    public int getPanjangSktmAl35() {
        return panjangSktmAl35;
    }

    /**
     * @param panjangSktmAl35 the panjangSktmAl35 to set
     */
    public void setPanjangSktmAl35(int panjangSktmAl35) {
        this.panjangSktmAl35 = panjangSktmAl35;
    }

    /**
     * @return the panjangSktmAl50
     */
    public int getPanjangSktmAl50() {
        return panjangSktmAl50;
    }

    /**
     * @param panjangSktmAl50 the panjangSktmAl50 to set
     */
    public void setPanjangSktmAl50(int panjangSktmAl50) {
        this.panjangSktmAl50 = panjangSktmAl50;
    }

    /**
     * @return the panjangSktmAl70
     */
    public int getPanjangSktmAl70() {
        return panjangSktmAl70;
    }

    /**
     * @param panjangSktmAl70 the panjangSktmAl70 to set
     */
    public void setPanjangSktmAl70(int panjangSktmAl70) {
        this.panjangSktmAl70 = panjangSktmAl70;
    }

    /**
     * @return the panjangSktmAl90
     */
    public int getPanjangSktmAl90() {
        return panjangSktmAl90;
    }

    /**
     * @param panjangSktmAl90 the panjangSktmAl90 to set
     */
    public void setPanjangSktmAl90(int panjangSktmAl90) {
        this.panjangSktmAl90 = panjangSktmAl90;
    }

    /**
     * @return the panjangSktmAl120
     */
    public int getPanjangSktmAl120() {
        return panjangSktmAl120;
    }

    /**
     * @param panjangSktmAl120 the panjangSktmAl120 to set
     */
    public void setPanjangSktmAl120(int panjangSktmAl120) {
        this.panjangSktmAl120 = panjangSktmAl120;
    }

    /**
     * @return the panjangSktmAl150
     */
    public int getPanjangSktmAl150() {
        return panjangSktmAl150;
    }

    /**
     * @param panjangSktmAl150 the panjangSktmAl150 to set
     */
    public void setPanjangSktmAl150(int panjangSktmAl150) {
        this.panjangSktmAl150 = panjangSktmAl150;
    }

    /**
     * @return the panjangSktmAl185
     */
    public int getPanjangSktmAl185() {
        return panjangSktmAl185;
    }

    /**
     * @param panjangSktmAl185 the panjangSktmAl185 to set
     */
    public void setPanjangSktmAl185(int panjangSktmAl185) {
        this.panjangSktmAl185 = panjangSktmAl185;
    }

    /**
     * @return the panjangSktmAl240
     */
    public int getPanjangSktmAl240() {
        return panjangSktmAl240;
    }

    /**
     * @param panjangSktmAl240 the panjangSktmAl240 to set
     */
    public void setPanjangSktmAl240(int panjangSktmAl240) {
        this.panjangSktmAl240 = panjangSktmAl240;
    }

    /**
     * @return the panjangSktmAl300
     */
    public int getPanjangSktmAl300() {
        return panjangSktmAl300;
    }

    /**
     * @param panjangSktmAl300 the panjangSktmAl300 to set
     */
    public void setPanjangSktmAl300(int panjangSktmAl300) {
        this.panjangSktmAl300 = panjangSktmAl300;
    }

    /**
     * @return the panjangSktmAl400
     */
    public int getPanjangSktmAl400() {
        return panjangSktmAl400;
    }

    /**
     * @param panjangSktmAl400 the panjangSktmAl400 to set
     */
    public void setPanjangSktmAl400(int panjangSktmAl400) {
        this.panjangSktmAl400 = panjangSktmAl400;
    }

    /**
     * @return the panjangSutmCu16
     */
    public int getPanjangSutmCu16() {
        return panjangSutmCu16;
    }

    /**
     * @param panjangSutmCu16 the panjangSutmCu16 to set
     */
    public void setPanjangSutmCu16(int panjangSutmCu16) {
        this.panjangSutmCu16 = panjangSutmCu16;
    }

    /**
     * @return the panjangSutmCu25
     */
    public int getPanjangSutmCu25() {
        return panjangSutmCu25;
    }

    /**
     * @param panjangSutmCu25 the panjangSutmCu25 to set
     */
    public void setPanjangSutmCu25(int panjangSutmCu25) {
        this.panjangSutmCu25 = panjangSutmCu25;
    }

    /**
     * @return the panjangSutmCu35
     */
    public int getPanjangSutmCu35() {
        return panjangSutmCu35;
    }

    /**
     * @param panjangSutmCu35 the panjangSutmCu35 to set
     */
    public void setPanjangSutmCu35(int panjangSutmCu35) {
        this.panjangSutmCu35 = panjangSutmCu35;
    }

    /**
     * @return the panjangSutmCu50
     */
    public int getPanjangSutmCu50() {
        return panjangSutmCu50;
    }

    /**
     * @param panjangSutmCu50 the panjangSutmCu50 to set
     */
    public void setPanjangSutmCu50(int panjangSutmCu50) {
        this.panjangSutmCu50 = panjangSutmCu50;
    }

    /**
     * @return the panjangSutmCu70
     */
    public int getPanjangSutmCu70() {
        return panjangSutmCu70;
    }

    /**
     * @param panjangSutmCu70 the panjangSutmCu70 to set
     */
    public void setPanjangSutmCu70(int panjangSutmCu70) {
        this.panjangSutmCu70 = panjangSutmCu70;
    }

    /**
     * @return the panjangSutmCu95
     */
    public int getPanjangSutmCu95() {
        return panjangSutmCu95;
    }

    /**
     * @param panjangSutmCu95 the panjangSutmCu95 to set
     */
    public void setPanjangSutmCu95(int panjangSutmCu95) {
        this.panjangSutmCu95 = panjangSutmCu95;
    }

    /**
     * @return the panjangSutmCu110
     */
    public int getPanjangSutmCu110() {
        return panjangSutmCu110;
    }

    /**
     * @param panjangSutmCu110 the panjangSutmCu110 to set
     */
    public void setPanjangSutmCu110(int panjangSutmCu110) {
        this.panjangSutmCu110 = panjangSutmCu110;
    }

    /**
     * @return the panjangSutmCu120
     */
    public int getPanjangSutmCu120() {
        return panjangSutmCu120;
    }

    /**
     * @param panjangSutmCu120 the panjangSutmCu120 to set
     */
    public void setPanjangSutmCu120(int panjangSutmCu120) {
        this.panjangSutmCu120 = panjangSutmCu120;
    }

    /**
     * @return the panjangSutmCu150
     */
    public int getPanjangSutmCu150() {
        return panjangSutmCu150;
    }

    /**
     * @param panjangSutmCu150 the panjangSutmCu150 to set
     */
    public void setPanjangSutmCu150(int panjangSutmCu150) {
        this.panjangSutmCu150 = panjangSutmCu150;
    }

    /**
     * @return the panjangSutmCu185
     */
    public int getPanjangSutmCu185() {
        return panjangSutmCu185;
    }

    /**
     * @param panjangSutmCu185 the panjangSutmCu185 to set
     */
    public void setPanjangSutmCu185(int panjangSutmCu185) {
        this.panjangSutmCu185 = panjangSutmCu185;
    }

    /**
     * @return the panjangSutmCu240
     */
    public int getPanjangSutmCu240() {
        return panjangSutmCu240;
    }

    /**
     * @param panjangSutmCu240 the panjangSutmCu240 to set
     */
    public void setPanjangSutmCu240(int panjangSutmCu240) {
        this.panjangSutmCu240 = panjangSutmCu240;
    }

    /**
     * @return the panjangSutmCu300
     */
    public int getPanjangSutmCu300() {
        return panjangSutmCu300;
    }

    /**
     * @param panjangSutmCu300 the panjangSutmCu300 to set
     */
    public void setPanjangSutmCu300(int panjangSutmCu300) {
        this.panjangSutmCu300 = panjangSutmCu300;
    }

    /**
     * @return the panjangSutmCu400
     */
    public int getPanjangSutmCu400() {
        return panjangSutmCu400;
    }

    /**
     * @param panjangSutmCu400 the panjangSutmCu400 to set
     */
    public void setPanjangSutmCu400(int panjangSutmCu400) {
        this.panjangSutmCu400 = panjangSutmCu400;
    }

    /**
     * @return the panjangSutmCu500
     */
    public int getPanjangSutmCu500() {
        return panjangSutmCu500;
    }

    /**
     * @param panjangSutmCu500 the panjangSutmCu500 to set
     */
    public void setPanjangSutmCu500(int panjangSutmCu500) {
        this.panjangSutmCu500 = panjangSutmCu500;
    }

    /**
     * @return the panjangSutmAl16
     */
    public int getPanjangSutmAl16() {
        return panjangSutmAl16;
    }

    /**
     * @param panjangSutmAl16 the panjangSutmAl16 to set
     */
    public void setPanjangSutmAl16(int panjangSutmAl16) {
        this.panjangSutmAl16 = panjangSutmAl16;
    }

    /**
     * @return the panjangSutmAl25
     */
    public int getPanjangSutmAl25() {
        return panjangSutmAl25;
    }

    /**
     * @param panjangSutmAl25 the panjangSutmAl25 to set
     */
    public void setPanjangSutmAl25(int panjangSutmAl25) {
        this.panjangSutmAl25 = panjangSutmAl25;
    }

    /**
     * @return the panjangSutmAl35
     */
    public int getPanjangSutmAl35() {
        return panjangSutmAl35;
    }

    /**
     * @param panjangSutmAl35 the panjangSutmAl35 to set
     */
    public void setPanjangSutmAl35(int panjangSutmAl35) {
        this.panjangSutmAl35 = panjangSutmAl35;
    }

    /**
     * @return the panjangSutmAl50
     */
    public int getPanjangSutmAl50() {
        return panjangSutmAl50;
    }

    /**
     * @param panjangSutmAl50 the panjangSutmAl50 to set
     */
    public void setPanjangSutmAl50(int panjangSutmAl50) {
        this.panjangSutmAl50 = panjangSutmAl50;
    }

    /**
     * @return the panjangSutmAl70
     */
    public int getPanjangSutmAl70() {
        return panjangSutmAl70;
    }

    /**
     * @param panjangSutmAl70 the panjangSutmAl70 to set
     */
    public void setPanjangSutmAl70(int panjangSutmAl70) {
        this.panjangSutmAl70 = panjangSutmAl70;
    }

    /**
     * @return the panjangSutmAl95
     */
    public int getPanjangSutmAl95() {
        return panjangSutmAl95;
    }

    /**
     * @param panjangSutmAl95 the panjangSutmAl95 to set
     */
    public void setPanjangSutmAl95(int panjangSutmAl95) {
        this.panjangSutmAl95 = panjangSutmAl95;
    }

    /**
     * @return the panjangSutmAl100
     */
    public int getPanjangSutmAl100() {
        return panjangSutmAl100;
    }

    /**
     * @param panjangSutmAl100 the panjangSutmAl100 to set
     */
    public void setPanjangSutmAl100(int panjangSutmAl100) {
        this.panjangSutmAl100 = panjangSutmAl100;
    }

    /**
     * @return the panjangSutmAl120
     */
    public int getPanjangSutmAl120() {
        return panjangSutmAl120;
    }

    /**
     * @param panjangSutmAl120 the panjangSutmAl120 to set
     */
    public void setPanjangSutmAl120(int panjangSutmAl120) {
        this.panjangSutmAl120 = panjangSutmAl120;
    }

    /**
     * @return the panjangSutmAl150
     */
    public int getPanjangSutmAl150() {
        return panjangSutmAl150;
    }

    /**
     * @param panjangSutmAl150 the panjangSutmAl150 to set
     */
    public void setPanjangSutmAl150(int panjangSutmAl150) {
        this.panjangSutmAl150 = panjangSutmAl150;
    }

    /**
     * @return the panjangSutmAl185
     */
    public int getPanjangSutmAl185() {
        return panjangSutmAl185;
    }

    /**
     * @param panjangSutmAl185 the panjangSutmAl185 to set
     */
    public void setPanjangSutmAl185(int panjangSutmAl185) {
        this.panjangSutmAl185 = panjangSutmAl185;
    }

    /**
     * @return the panjangSutmAl240
     */
    public int getPanjangSutmAl240() {
        return panjangSutmAl240;
    }

    /**
     * @param panjangSutmAl240 the panjangSutmAl240 to set
     */
    public void setPanjangSutmAl240(int panjangSutmAl240) {
        this.panjangSutmAl240 = panjangSutmAl240;
    }

    /**
     * @return the panjangSutmAl300
     */
    public int getPanjangSutmAl300() {
        return panjangSutmAl300;
    }

    /**
     * @param panjangSutmAl300 the panjangSutmAl300 to set
     */
    public void setPanjangSutmAl300(int panjangSutmAl300) {
        this.panjangSutmAl300 = panjangSutmAl300;
    }

    /**
     * @return the panjangSutmAl400
     */
    public int getPanjangSutmAl400() {
        return panjangSutmAl400;
    }

    /**
     * @param panjangSutmAl400 the panjangSutmAl400 to set
     */
    public void setPanjangSutmAl400(int panjangSutmAl400) {
        this.panjangSutmAl400 = panjangSutmAl400;
    }

    /**
     * @return the panjangSutmAl500
     */
    public int getPanjangSutmAl500() {
        return panjangSutmAl500;
    }

    /**
     * @param panjangSutmAl500 the panjangSutmAl500 to set
     */
    public void setPanjangSutmAl500(int panjangSutmAl500) {
        this.panjangSutmAl500 = panjangSutmAl500;
    }

    /**
     * @return the panjangSutrCu6
     */
    public int getPanjangSutrCu6() {
        return panjangSutrCu6;
    }

    /**
     * @param panjangSutrCu6 the panjangSutrCu6 to set
     */
    public void setPanjangSutrCu6(int panjangSutrCu6) {
        this.panjangSutrCu6 = panjangSutrCu6;
    }

    /**
     * @return the panjangSutrCu10
     */
    public int getPanjangSutrCu10() {
        return panjangSutrCu10;
    }

    /**
     * @param panjangSutrCu10 the panjangSutrCu10 to set
     */
    public void setPanjangSutrCu10(int panjangSutrCu10) {
        this.panjangSutrCu10 = panjangSutrCu10;
    }

    /**
     * @return the panjangSutrCu16
     */
    public int getPanjangSutrCu16() {
        return panjangSutrCu16;
    }

    /**
     * @param panjangSutrCu16 the panjangSutrCu16 to set
     */
    public void setPanjangSutrCu16(int panjangSutrCu16) {
        this.panjangSutrCu16 = panjangSutrCu16;
    }

    /**
     * @return the panjangSutrCu25
     */
    public int getPanjangSutrCu25() {
        return panjangSutrCu25;
    }

    /**
     * @param panjangSutrCu25 the panjangSutrCu25 to set
     */
    public void setPanjangSutrCu25(int panjangSutrCu25) {
        this.panjangSutrCu25 = panjangSutrCu25;
    }

    /**
     * @return the panjangSutrCu35
     */
    public int getPanjangSutrCu35() {
        return panjangSutrCu35;
    }

    /**
     * @param panjangSutrCu35 the panjangSutrCu35 to set
     */
    public void setPanjangSutrCu35(int panjangSutrCu35) {
        this.panjangSutrCu35 = panjangSutrCu35;
    }

    /**
     * @return the panjangSutrCu50
     */
    public int getPanjangSutrCu50() {
        return panjangSutrCu50;
    }

    /**
     * @param panjangSutrCu50 the panjangSutrCu50 to set
     */
    public void setPanjangSutrCu50(int panjangSutrCu50) {
        this.panjangSutrCu50 = panjangSutrCu50;
    }

    /**
     * @return the panjangSutrCu70
     */
    public int getPanjangSutrCu70() {
        return panjangSutrCu70;
    }

    /**
     * @param panjangSutrCu70 the panjangSutrCu70 to set
     */
    public void setPanjangSutrCu70(int panjangSutrCu70) {
        this.panjangSutrCu70 = panjangSutrCu70;
    }

    /**
     * @return the panjangSutrCu95
     */
    public int getPanjangSutrCu95() {
        return panjangSutrCu95;
    }

    /**
     * @param panjangSutrCu95 the panjangSutrCu95 to set
     */
    public void setPanjangSutrCu95(int panjangSutrCu95) {
        this.panjangSutrCu95 = panjangSutrCu95;
    }

    /**
     * @return the panjangSutrCu110
     */
    public int getPanjangSutrCu110() {
        return panjangSutrCu110;
    }

    /**
     * @param panjangSutrCu110 the panjangSutrCu110 to set
     */
    public void setPanjangSutrCu110(int panjangSutrCu110) {
        this.panjangSutrCu110 = panjangSutrCu110;
    }

    /**
     * @return the panjangSutrCu120
     */
    public int getPanjangSutrCu120() {
        return panjangSutrCu120;
    }

    /**
     * @param panjangSutrCu120 the panjangSutrCu120 to set
     */
    public void setPanjangSutrCu120(int panjangSutrCu120) {
        this.panjangSutrCu120 = panjangSutrCu120;
    }

    /**
     * @return the panjangSutrCu150
     */
    public int getPanjangSutrCu150() {
        return panjangSutrCu150;
    }

    /**
     * @param panjangSutrCu150 the panjangSutrCu150 to set
     */
    public void setPanjangSutrCu150(int panjangSutrCu150) {
        this.panjangSutrCu150 = panjangSutrCu150;
    }

    /**
     * @return the panjangSutrCu185
     */
    public int getPanjangSutrCu185() {
        return panjangSutrCu185;
    }

    /**
     * @param panjangSutrCu185 the panjangSutrCu185 to set
     */
    public void setPanjangSutrCu185(int panjangSutrCu185) {
        this.panjangSutrCu185 = panjangSutrCu185;
    }

    /**
     * @return the panjangSutrCu240
     */
    public int getPanjangSutrCu240() {
        return panjangSutrCu240;
    }

    /**
     * @param panjangSutrCu240 the panjangSutrCu240 to set
     */
    public void setPanjangSutrCu240(int panjangSutrCu240) {
        this.panjangSutrCu240 = panjangSutrCu240;
    }

    /**
     * @return the panjangSutrCu300
     */
    public int getPanjangSutrCu300() {
        return panjangSutrCu300;
    }

    /**
     * @param panjangSutrCu300 the panjangSutrCu300 to set
     */
    public void setPanjangSutrCu300(int panjangSutrCu300) {
        this.panjangSutrCu300 = panjangSutrCu300;
    }

    /**
     * @return the panjangSutrCu400
     */
    public int getPanjangSutrCu400() {
        return panjangSutrCu400;
    }

    /**
     * @param panjangSutrCu400 the panjangSutrCu400 to set
     */
    public void setPanjangSutrCu400(int panjangSutrCu400) {
        this.panjangSutrCu400 = panjangSutrCu400;
    }

    /**
     * @return the panjangSutrCu500
     */
    public int getPanjangSutrCu500() {
        return panjangSutrCu500;
    }

    /**
     * @param panjangSutrCu500 the panjangSutrCu500 to set
     */
    public void setPanjangSutrCu500(int panjangSutrCu500) {
        this.panjangSutrCu500 = panjangSutrCu500;
    }

    /**
     * @return the panjangSutrAl16
     */
    public int getPanjangSutrAl16() {
        return panjangSutrAl16;
    }

    /**
     * @param panjangSutrAl16 the panjangSutrAl16 to set
     */
    public void setPanjangSutrAl16(int panjangSutrAl16) {
        this.panjangSutrAl16 = panjangSutrAl16;
    }

    /**
     * @return the panjangSutrAl25
     */
    public int getPanjangSutrAl25() {
        return panjangSutrAl25;
    }

    /**
     * @param panjangSutrAl25 the panjangSutrAl25 to set
     */
    public void setPanjangSutrAl25(int panjangSutrAl25) {
        this.panjangSutrAl25 = panjangSutrAl25;
    }

    /**
     * @return the panjangSutrAl35
     */
    public int getPanjangSutrAl35() {
        return panjangSutrAl35;
    }

    /**
     * @param panjangSutrAl35 the panjangSutrAl35 to set
     */
    public void setPanjangSutrAl35(int panjangSutrAl35) {
        this.panjangSutrAl35 = panjangSutrAl35;
    }

    /**
     * @return the panjangSutrAl50
     */
    public int getPanjangSutrAl50() {
        return panjangSutrAl50;
    }

    /**
     * @param panjangSutrAl50 the panjangSutrAl50 to set
     */
    public void setPanjangSutrAl50(int panjangSutrAl50) {
        this.panjangSutrAl50 = panjangSutrAl50;
    }

    /**
     * @return the panjangSutrAl70
     */
    public int getPanjangSutrAl70() {
        return panjangSutrAl70;
    }

    /**
     * @param panjangSutrAl70 the panjangSutrAl70 to set
     */
    public void setPanjangSutrAl70(int panjangSutrAl70) {
        this.panjangSutrAl70 = panjangSutrAl70;
    }

    /**
     * @return the panjangSutrAl95
     */
    public int getPanjangSutrAl95() {
        return panjangSutrAl95;
    }

    /**
     * @param panjangSutrAl95 the panjangSutrAl95 to set
     */
    public void setPanjangSutrAl95(int panjangSutrAl95) {
        this.panjangSutrAl95 = panjangSutrAl95;
    }

    /**
     * @return the panjangSutrAl100
     */
    public int getPanjangSutrAl100() {
        return panjangSutrAl100;
    }

    /**
     * @param panjangSutrAl100 the panjangSutrAl100 to set
     */
    public void setPanjangSutrAl100(int panjangSutrAl100) {
        this.panjangSutrAl100 = panjangSutrAl100;
    }

    /**
     * @return the panjangSutrAl120
     */
    public int getPanjangSutrAl120() {
        return panjangSutrAl120;
    }

    /**
     * @param panjangSutrAl120 the panjangSutrAl120 to set
     */
    public void setPanjangSutrAl120(int panjangSutrAl120) {
        this.panjangSutrAl120 = panjangSutrAl120;
    }

    /**
     * @return the panjangSutrAl150
     */
    public int getPanjangSutrAl150() {
        return panjangSutrAl150;
    }

    /**
     * @param panjangSutrAl150 the panjangSutrAl150 to set
     */
    public void setPanjangSutrAl150(int panjangSutrAl150) {
        this.panjangSutrAl150 = panjangSutrAl150;
    }

    /**
     * @return the panjangSutrAl185
     */
    public int getPanjangSutrAl185() {
        return panjangSutrAl185;
    }

    /**
     * @param panjangSutrAl185 the panjangSutrAl185 to set
     */
    public void setPanjangSutrAl185(int panjangSutrAl185) {
        this.panjangSutrAl185 = panjangSutrAl185;
    }

    /**
     * @return the panjangSutrAl240
     */
    public int getPanjangSutrAl240() {
        return panjangSutrAl240;
    }

    /**
     * @param panjangSutrAl240 the panjangSutrAl240 to set
     */
    public void setPanjangSutrAl240(int panjangSutrAl240) {
        this.panjangSutrAl240 = panjangSutrAl240;
    }

    /**
     * @return the panjangSutrAl300
     */
    public int getPanjangSutrAl300() {
        return panjangSutrAl300;
    }

    /**
     * @param panjangSutrAl300 the panjangSutrAl300 to set
     */
    public void setPanjangSutrAl300(int panjangSutrAl300) {
        this.panjangSutrAl300 = panjangSutrAl300;
    }

    /**
     * @return the panjangSutrAl400
     */
    public int getPanjangSutrAl400() {
        return panjangSutrAl400;
    }

    /**
     * @param panjangSutrAl400 the panjangSutrAl400 to set
     */
    public void setPanjangSutrAl400(int panjangSutrAl400) {
        this.panjangSutrAl400 = panjangSutrAl400;
    }

    /**
     * @return the panjangSutrAl500
     */
    public int getPanjangSutrAl500() {
        return panjangSutrAl500;
    }

    /**
     * @param panjangSutrAl500 the panjangSutrAl500 to set
     */
    public void setPanjangSutrAl500(int panjangSutrAl500) {
        this.panjangSutrAl500 = panjangSutrAl500;
    }

    /**
     * @return the panjangSrCu6
     */
    public int getPanjangSrCu6() {
        return panjangSrCu6;
    }

    /**
     * @param panjangSrCu6 the panjangSrCu6 to set
     */
    public void setPanjangSrCu6(int panjangSrCu6) {
        this.panjangSrCu6 = panjangSrCu6;
    }

    /**
     * @return the panjangSrCu10
     */
    public int getPanjangSrCu10() {
        return panjangSrCu10;
    }

    /**
     * @param panjangSrCu10 the panjangSrCu10 to set
     */
    public void setPanjangSrCu10(int panjangSrCu10) {
        this.panjangSrCu10 = panjangSrCu10;
    }

    /**
     * @return the panjangSrCu16
     */
    public int getPanjangSrCu16() {
        return panjangSrCu16;
    }

    /**
     * @param panjangSrCu16 the panjangSrCu16 to set
     */
    public void setPanjangSrCu16(int panjangSrCu16) {
        this.panjangSrCu16 = panjangSrCu16;
    }

    /**
     * @return the panjangSrAl10
     */
    public int getPanjangSrAl10() {
        return panjangSrAl10;
    }

    /**
     * @param panjangSrAl10 the panjangSrAl10 to set
     */
    public void setPanjangSrAl10(int panjangSrAl10) {
        this.panjangSrAl10 = panjangSrAl10;
    }

    /**
     * @return the panjangSrAl16
     */
    public int getPanjangSrAl16() {
        return panjangSrAl16;
    }

    /**
     * @param panjangSrAl16 the panjangSrAl16 to set
     */
    public void setPanjangSrAl16(int panjangSrAl16) {
        this.panjangSrAl16 = panjangSrAl16;
    }

    /**
     * @return the jumlahTrafo25
     */
    public int getJumlahTrafo25() {
        return jumlahTrafo25;
    }

    /**
     * @param jumlahTrafo25 the jumlahTrafo25 to set
     */
    public void setJumlahTrafo25(int jumlahTrafo25) {
        this.jumlahTrafo25 = jumlahTrafo25;
    }

    /**
     * @return the jumlahTrafo50
     */
    public int getJumlahTrafo50() {
        return jumlahTrafo50;
    }

    /**
     * @param jumlahTrafo50 the jumlahTrafo50 to set
     */
    public void setJumlahTrafo50(int jumlahTrafo50) {
        this.jumlahTrafo50 = jumlahTrafo50;
    }

    /**
     * @return the jumlahTrafo100
     */
    public int getJumlahTrafo100() {
        return jumlahTrafo100;
    }

    /**
     * @param jumlahTrafo100 the jumlahTrafo100 to set
     */
    public void setJumlahTrafo100(int jumlahTrafo100) {
        this.jumlahTrafo100 = jumlahTrafo100;
    }

    /**
     * @return the jumlahTrafo160
     */
    public int getJumlahTrafo160() {
        return jumlahTrafo160;
    }

    /**
     * @param jumlahTrafo160 the jumlahTrafo160 to set
     */
    public void setJumlahTrafo160(int jumlahTrafo160) {
        this.jumlahTrafo160 = jumlahTrafo160;
    }

    /**
     * @return the jumlahTrafo200
     */
    public int getJumlahTrafo200() {
        return jumlahTrafo200;
    }

    /**
     * @param jumlahTrafo200 the jumlahTrafo200 to set
     */
    public void setJumlahTrafo200(int jumlahTrafo200) {
        this.jumlahTrafo200 = jumlahTrafo200;
    }

    /**
     * @return the jumlahTrafo250
     */
    public int getJumlahTrafo250() {
        return jumlahTrafo250;
    }

    /**
     * @param jumlahTrafo250 the jumlahTrafo250 to set
     */
    public void setJumlahTrafo250(int jumlahTrafo250) {
        this.jumlahTrafo250 = jumlahTrafo250;
    }

    /**
     * @return the jumlahTrafo315
     */
    public int getJumlahTrafo315() {
        return jumlahTrafo315;
    }

    /**
     * @param jumlahTrafo315 the jumlahTrafo315 to set
     */
    public void setJumlahTrafo315(int jumlahTrafo315) {
        this.jumlahTrafo315 = jumlahTrafo315;
    }

    /**
     * @return the jumlahTrafo400
     */
    public int getJumlahTrafo400() {
        return jumlahTrafo400;
    }

    /**
     * @param jumlahTrafo400 the jumlahTrafo400 to set
     */
    public void setJumlahTrafo400(int jumlahTrafo400) {
        this.jumlahTrafo400 = jumlahTrafo400;
    }

    /**
     * @return the jumlahTrafo500
     */
    public int getJumlahTrafo500() {
        return jumlahTrafo500;
    }

    /**
     * @param jumlahTrafo500 the jumlahTrafo500 to set
     */
    public void setJumlahTrafo500(int jumlahTrafo500) {
        this.jumlahTrafo500 = jumlahTrafo500;
    }

    /**
     * @return the jumlahTrafo630
     */
    public int getJumlahTrafo630() {
        return jumlahTrafo630;
    }

    /**
     * @param jumlahTrafo630 the jumlahTrafo630 to set
     */
    public void setJumlahTrafo630(int jumlahTrafo630) {
        this.jumlahTrafo630 = jumlahTrafo630;
    }

    /**
     * @return the jumlahTrafo800
     */
    public int getJumlahTrafo800() {
        return jumlahTrafo800;
    }

    /**
     * @param jumlahTrafo800 the jumlahTrafo800 to set
     */
    public void setJumlahTrafo800(int jumlahTrafo800) {
        this.jumlahTrafo800 = jumlahTrafo800;
    }

    /**
     * @return the jumlahTrafo1000
     */
    public int getJumlahTrafo1000() {
        return jumlahTrafo1000;
    }

    /**
     * @param jumlahTrafo1000 the jumlahTrafo1000 to set
     */
    public void setJumlahTrafo1000(int jumlahTrafo1000) {
        this.jumlahTrafo1000 = jumlahTrafo1000;
    }

    /**
     * @return the jumlahTrafo1250
     */
    public int getJumlahTrafo1250() {
        return jumlahTrafo1250;
    }

    /**
     * @param jumlahTrafo1250 the jumlahTrafo1250 to set
     */
    public void setJumlahTrafo1250(int jumlahTrafo1250) {
        this.jumlahTrafo1250 = jumlahTrafo1250;
    }

    /**
     * @return the jumlahTrafo1600
     */
    public int getJumlahTrafo1600() {
        return jumlahTrafo1600;
    }

    /**
     * @param jumlahTrafo1600 the jumlahTrafo1600 to set
     */
    public void setJumlahTrafo1600(int jumlahTrafo1600) {
        this.jumlahTrafo1600 = jumlahTrafo1600;
    }

    /**
     * @return the jumlahTrafo2000
     */
    public int getJumlahTrafo2000() {
        return jumlahTrafo2000;
    }

    /**
     * @param jumlahTrafo2000 the jumlahTrafo2000 to set
     */
    public void setJumlahTrafo2000(int jumlahTrafo2000) {
        this.jumlahTrafo2000 = jumlahTrafo2000;
    }

    /**
     * @return the jumlahTrafo2500
     */
    public int getJumlahTrafo2500() {
        return jumlahTrafo2500;
    }

    /**
     * @param jumlahTrafo2500 the jumlahTrafo2500 to set
     */
    public void setJumlahTrafo2500(int jumlahTrafo2500) {
        this.jumlahTrafo2500 = jumlahTrafo2500;
    }
}
