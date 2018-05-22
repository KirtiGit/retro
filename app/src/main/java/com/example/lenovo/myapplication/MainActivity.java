package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.lenovo.myapplication.Remote.APIService;
import com.example.lenovo.myapplication.Remote.ApiUtils;
import com.example.lenovo.myapplication.Samples.MyPOJO;
import com.example.lenovo.myapplication.Samples.MyPOJOPARA;
import com.example.lenovo.myapplication.Samples.OrderMoredetail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    final String demoString = "1,21,20,2,5,19";
    int temp;
    TextView mResponseTv;
    private List<OrderMoredetail> orderMoredetail = new ArrayList<>();
    private APIService mAPIService;
    List<String> strings= Arrays.asList(demoString.split(","));
    ListView  listView;
    int first,last,middle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list_item);
        mResponseTv=findViewById(R.id.text);
        mAPIService = ApiUtils.getAPIService();
        for (int i = 0; i <strings.size() ; i++) {
            for (int j = 1; j <strings.size() ; j++) {
                int a=Integer.parseInt(strings.get(j-1));
                int b=Integer.parseInt(strings.get(j));
                if(a>b)
                {
                    temp=a;
                    strings.set((j-1),String.valueOf(b));
                    strings.set(j,String.valueOf(temp));
                }
                
            }
        }
        ArrayAdapter<String> stringArrayAdapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,strings);
        listView.setAdapter(stringArrayAdapter);

    }

    public void Clickperformpara(View view)
    {
        Call<MyPOJOPARA> call = mAPIService.savePostpara(25,3);
        call.enqueue(new Callback<MyPOJOPARA>() {
            @Override
            public void onResponse(Call<MyPOJOPARA> call, Response<MyPOJOPARA> response) {
                if(response.isSuccessful()) {
                    MyPOJOPARA myPOJO=response.body();
                    orderMoredetail=myPOJO.getOrderMoredetail();
                    Toast.makeText(MainActivity.this, ""+orderMoredetail.get(0).getPCode(), Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, " in else", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<MyPOJOPARA> call, Throwable t) {
                Log.e("", "Unable to submit post to API.");
                Toast.makeText(MainActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void sendPost() {
        Toast.makeText(this, "here", Toast.LENGTH_SHORT).show();

        Call<MyPOJO> call = mAPIService.savePost();
        call.enqueue(new Callback<MyPOJO>() {
            @Override
            public void onResponse(Call<MyPOJO> call, Response<MyPOJO> response) {
                if(response.isSuccessful()) {
MyPOJO myPOJO=response.body();
                    Toast.makeText(MainActivity.this, ""+myPOJO.getSuccess(), Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, " in else", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<MyPOJO> call, Throwable t) {
                Log.e("", "Unable to submit post to API.");
                Toast.makeText(MainActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showResponse(String response) {
        if(mResponseTv.getVisibility() == View.GONE) {
            mResponseTv.setVisibility(View.VISIBLE);
        }
        mResponseTv.setText(response);
    }
   public void Clickperform(View view)
    {
        sendPost();
    }
        /*Toast.makeText(this, "Clickes", Toast.LENGTH_SHORT).show();
        first=0;
        last=(strings.size()-1);
        middle=(first+last)/2;
        while (first<last)
        {
            Toast.makeText(this, "in loop", Toast.LENGTH_SHORT).show();
            temp= Integer.parseInt(strings.POST(middle));

            if(temp<19)
            {
                Toast.makeText(this, "in first", Toast.LENGTH_SHORT).show();
               first=middle+1;
            }
            else if(temp==19)
            {
                Toast.makeText(this, "element found str"+middle, Toast.LENGTH_SHORT).show();

            }else {
                Toast.makeText(this, "in last", Toast.LENGTH_SHORT).show();
last=middle-1;
            }
            middle=(first+last)/2;
        }
        if(first>last)
        {
            Toast.makeText(this, "Not found", Toast.LENGTH_SHORT).show();
        }

    }*/
}
