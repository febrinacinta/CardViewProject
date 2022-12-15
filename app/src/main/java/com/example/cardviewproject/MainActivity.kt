package com.example.cardviewproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cardviewproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MovieClickListener
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate (savedInstanceState: Bundle?)
    {
        super.onCreate (savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView (binding.root)

        populateMovies ()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter (movieList, mainActivity)
        }
    }

    override fun onClick(movie: Movie)
    {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(MOVIE_ID_EXTRA, movie.id)
        startActivity(intent)
    }
    private fun populateMovies()
    {
        val movie1 = Movie(
            R.drawable.brave,
            "Action, Adventure",
            "BRAVE",
            "Merida adalah pemanah ulung yang juga putri Raja Fergus dan Ratu Elinor di Skotlandia. Merida ingin membuktikan kemampuannya sebagai pahlawan, meskipun ia harus melanggar tradisi keramat para dewa. Pelanggaran ini membuat kerajaan kacau balau, dan sebuah kutukan besar menimpa kerajaan. Sekarang saatnya Merida membuktikan bahwa dirinya adalah pejuang sejati yang dapat membebaskan kerajaan dari kutukan."
        )
        movieList.add(movie1)

        val movie2 = Movie(
            R.drawable.encanto,
            "Adventure, Drama",
            "ENCANTO",
            "Encanto menceritakan kisah keluarga Madrigals yang luar biasa, yang hidup tersembunyi di pegunungan Kolombia, di tempat yang menakjubkan dan mempesona yang disebut Encanto."
        )
        movieList.add(movie2)

        val movie3 = Movie(
            R.drawable.tangled,
            "Romance, Drama",
            "TANGLED",
            "Rapunzel, gadis muda nan lugu, dikurung ibunya yang sangat protektif di atas menara. Harapannya untuk kabur dan melihat dunia luar menjadi kenyataan saat seorang pencuri baik hati memanjat menaranya."
        )
        movieList.add(movie3)

        val movie4 = Movie(
            R.drawable.luca,
            "Drama",
            "LUCA",
            "Film Luca menceritakan tentang petualangan monster laut berusia 13 tahun bernama Luca Paguro. Sehari-hari, Luca bertugas menggembala ikan-ikan ternak milik keluarganya. Suatu hari, Luca menemukan barang-barang manusia yang jatuh dari kapal."
        )
        movieList.add(movie4)

        val movie5 = Movie(
            R.drawable.raya,
            "Fantasy, Adventure",
            "RAYA",
            "Dahulu kala, di dunia fantasi Kumandra, manusia dan naga hidup bersama secara harmonis. Namun, ketika monster jahat yang dikenal sebagai Druun mengancam daratan, para naga mengorbankan diri mereka untuk menyelamatkan umat manusia. Sekarang, 500 tahun kemudian, monster yang sama telah kembali, dan seorang prajurit hadir untuk mencari naga terakhir dan menghentikan Druun untuk selamanya."
        )
        movieList.add(movie5)

        val movie6 = Movie(
            R.drawable.soul,
            "Fantasy, Drama",
            "Soul",
            "Film animasi hasil kerjasama Pixar dan Disney ini bercerita tentang Joe Gardner, seorang guru musik yang mempunyai mimpi untuk menjadi musisi Jazz terkenal. Impian yang tidak kunjung terwujud serta perbedaan pandangan hidup dengan ibunya, membuat dia merasa jenuh dan hampa dengan kehidupannya yang sekarang."
        )
        movieList.add(movie6)

        val movie7 = Movie(
            R.drawable.turningred,
            "Drama, Fantasy, Family",
            "Turning Red",
            "Film Turning Red mengambil latar pada April 2002 di Toronto, Kanada. Mengisahkan tentang Meilin \"Mei\" Lee adalah seorang gadis remaja berprestasi tinggi yang menganggap dirinya sempurna dengan menguasai kelasnya sebagai siswa A+ dan selalu mendapatkan nilai 100."
        )
        movieList.add(movie7)

        movieList.add(movie1)
        movieList.add(movie2)
        movieList.add(movie3)
        movieList.add(movie4)
        movieList.add(movie5)
        movieList.add(movie6)
        movieList.add(movie7)
    }
}


