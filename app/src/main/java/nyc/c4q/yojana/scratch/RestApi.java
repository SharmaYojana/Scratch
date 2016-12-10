package nyc.c4q.yojana.scratch;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by yojanasharma on 12/9/16.
 */

public interface RestApi {
    @GET ("rest/v1/name/q/")
    Call<List<Example>> getCountryInfo();
}
