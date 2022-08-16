package br.com.myskout.tablayoutfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;


public class HomeFragment extends Fragment {
    ListView lstGatos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        lstGatos = view.findViewById(R.id.lstGatos);

        //Instanciando a classe adaptadora
        AdapterGatos adapterGatos = new AdapterGatos();


        //Carregar a lista com o adaptador
        lstGatos.setAdapter(adapterGatos);

        return view;
    }
    //Criando a minha classe adaptadora ou inner class
    public class AdapterGatos extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }
}