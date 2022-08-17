package br.com.myskout.tablayoutfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class HomeFragment extends Fragment {
    ListView lstGatos;

    //Criar os dados
    String nomeGato[] = {"Panqueca", "Soneca", "Juma", "Ramela"};
    String descricaoGato[] = {
            "Quero ser adotado alguém ai se disponibiliza...",
            "Alguém gosta de gato, estou aqui...",
            "Gosto de humano, sou muito carinhoso...",
            "Estou disponível para ser adotado..."

    };
    String numGato[] = {"5.0", "8.0", "9.0", "9.5"};
    int imagemGato[] = {
            R.drawable.gato, R.drawable.ciames,
            R.drawable.rajado, R.drawable.preto_branco
    };

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
    public class AdapterGatos extends BaseAdapter {

        @Override
        public int getCount() {
            return imagemGato.length;
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
            //Declarando as variáveis do modelo
            TextView txtNomeGato, txtDescricaoGato, txtNumGato;
            ImageView imgGato;

            //Instanciar a janela do modelo no adapter
            View v = getLayoutInflater().inflate(R.layout.modelo_gatos,null);

            txtNomeGato = v.findViewById(R.id.txtNomeGato);
            txtDescricaoGato = v.findViewById(R.id.txtDescricaoGato);
            txtNumGato = v.findViewById(R.id.txtNumGato);
            imgGato = v.findViewById(R.id.imgModeloGato);

            //Inserindo valores nos objetos do modelo
            txtNomeGato.setText(nomeGato[i]);
            txtDescricaoGato.setText(descricaoGato[i]);
            txtNumGato.setText(numGato[i]);
            imgGato.setImageResource(imagemGato[i]);

            return v;
        }
    }
}