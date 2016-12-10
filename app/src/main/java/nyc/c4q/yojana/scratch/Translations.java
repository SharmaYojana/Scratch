
package nyc.c4q.yojana.scratch;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Translations implements Parcelable
{

    @SerializedName("de")
    @Expose
    private String de;
    @SerializedName("es")
    @Expose
    private String es;
    @SerializedName("fr")
    @Expose
    private String fr;
    @SerializedName("ja")
    @Expose
    private String ja;
    @SerializedName("it")
    @Expose
    private String it;
    public final static Parcelable.Creator<Translations> CREATOR = new Creator<Translations>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Translations createFromParcel(Parcel in) {
            Translations instance = new Translations();
            instance.de = ((String) in.readValue((String.class.getClassLoader())));
            instance.es = ((String) in.readValue((String.class.getClassLoader())));
            instance.fr = ((String) in.readValue((String.class.getClassLoader())));
            instance.ja = ((String) in.readValue((String.class.getClassLoader())));
            instance.it = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Translations[] newArray(int size) {
            return (new Translations[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The de
     */
    public String getDe() {
        return de;
    }

    /**
     * 
     * @param de
     *     The de
     */
    public void setDe(String de) {
        this.de = de;
    }

    /**
     * 
     * @return
     *     The es
     */
    public String getEs() {
        return es;
    }

    /**
     * 
     * @param es
     *     The es
     */
    public void setEs(String es) {
        this.es = es;
    }

    /**
     * 
     * @return
     *     The fr
     */
    public String getFr() {
        return fr;
    }

    /**
     * 
     * @param fr
     *     The fr
     */
    public void setFr(String fr) {
        this.fr = fr;
    }

    /**
     * 
     * @return
     *     The ja
     */
    public String getJa() {
        return ja;
    }

    /**
     * 
     * @param ja
     *     The ja
     */
    public void setJa(String ja) {
        this.ja = ja;
    }

    /**
     * 
     * @return
     *     The it
     */
    public String getIt() {
        return it;
    }

    /**
     * 
     * @param it
     *     The it
     */
    public void setIt(String it) {
        this.it = it;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(de);
        dest.writeValue(es);
        dest.writeValue(fr);
        dest.writeValue(ja);
        dest.writeValue(it);
    }

    public int describeContents() {
        return  0;
    }

}
