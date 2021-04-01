package com.jpa.ujian;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.ujian.entity.Dosen;
import com.jpa.ujian.entity.Mahasiswa;
import com.jpa.ujian.entity.MataKuliah;
import com.jpa.ujian.entity.Nilai;
import com.jpa.ujian.entity.Pertanyaan;
import com.jpa.ujian.entity.PlotMataKuliah;
import com.jpa.ujian.entity.Soal;
import com.jpa.ujian.repository.DosenRepository;
import com.jpa.ujian.repository.MahasiswaRepository;
import com.jpa.ujian.repository.MataKuliahRepository;
import com.jpa.ujian.repository.NilaiRepository;
import com.jpa.ujian.repository.PertanyaanRepository;
import com.jpa.ujian.repository.PlotMataKuliahRepository;
import com.jpa.ujian.repository.SoalRepository;

@SpringBootApplication
public class UjianJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UjianJpaApplication.class, args);
	}

	@Autowired
	SoalRepository soalRepository;
	
	@Autowired
	PertanyaanRepository pertanyaanRepository;
	
	@Autowired
	NilaiRepository nilaiRepository;
	
	@Autowired
	DosenRepository dosenRepository;
	
	@Autowired
	MahasiswaRepository mahasiswaRepository;
	
	@Autowired
	MataKuliahRepository mataKuliahRepository;
	
	@Autowired
	PlotMataKuliahRepository plotMataKuliahRepository;
	
	public void run (String...args) throws Exception {
		
/*		Soal soal = new Soal ();
		soal.setNama_soal("Biologi");
		soal.setStatus("2_Pertanyaan");
		
		Pertanyaan pertanyaan1 = new Pertanyaan();
		pertanyaan1.setPertanyaan("ikan bernafas dengan?");
		pertanyaan1.setJawaban_1("paru-paru");
		pertanyaan1.setJawaban_2("trakea");
		pertanyaan1.setJawaban_3("jantung");
		pertanyaan1.setJawaban_4("insang");
		pertanyaan1.setJawaban_benar("insang");
		pertanyaan1.setStatus_gambar("ikan");
		
		Pertanyaan pertanyaan2 = new Pertanyaan();
		pertanyaan2.setPertanyaan("burung bernafas dengan?");
		pertanyaan2.setJawaban_1("paru-paru");
		pertanyaan2.setJawaban_2("trakea");
		pertanyaan2.setJawaban_3("jantung");
		pertanyaan2.setJawaban_4("insang");
		pertanyaan2.setJawaban_benar("trakea");
		pertanyaan2.setStatus_gambar("burung");
		
		List<Pertanyaan> lstPertanyaan = new ArrayList<Pertanyaan>();
		lstPertanyaan.add(pertanyaan1);
		lstPertanyaan.add(pertanyaan2);
		
		soal.setLstPertanyaan(lstPertanyaan);
		this.soalRepository.save(soal);
		
		
		Nilai nilai1 = new Nilai();
		nilai1.setNilai(20);
		
		Nilai nilai2 = new Nilai();
		nilai2.setNilai(30);
		
		pertanyaan1.setNilai(nilai1);
		pertanyaan2.setNilai(nilai2);
		this.pertanyaanRepository.save(pertanyaan1);
		this.pertanyaanRepository.save(pertanyaan2);   */
		
//penjelasan dari source diatas : setiap jenis soal memiliki beberapa pertanyaan,
//									 dan setiap pertanyaan memiliki point nilai
		
		
//------------------------------------------------------------------------------------		
		
		
		Dosen dosen = new Dosen();
		dosen.setUsername("dindaaa");
		dosen.setPassword("prikitiew");
		dosen.setNama_dosen("dinda");
		
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNama_mahasiswa("Bima");
		mahasiswa.setJenis_kelamin("Laki-laki");
		mahasiswa.setPassword("bimasehat");
		
		MataKuliah matakuliah = new MataKuliah();
		matakuliah.setNama_matakuliah("Industri");
		
		List<Dosen> lstdosen = new ArrayList<Dosen>();
		lstdosen.add(dosen);
		
		List<Mahasiswa> lstmahasiswa = new ArrayList<Mahasiswa>();
		lstmahasiswa.add(mahasiswa);
		
		List<MataKuliah> lstmatakuliah = new ArrayList<MataKuliah>();
		lstmatakuliah.add(matakuliah);
		
		PlotMataKuliah plotmatakuliah = new PlotMataKuliah();
		
		plotmatakuliah.setLstdosen(lstdosen);
		plotmatakuliah.setLstmahasiswa(lstmahasiswa);
		plotmatakuliah.setLstmatakuliah(lstmatakuliah);
		this.plotMataKuliahRepository.save(plotmatakuliah);

//Penjelasan diatas : untuk menggabungkan table mahasiswa, tabel dosen, tabel mata kuliah
//                    menjadi satu didalam tabel plot mata kuliah
		

//------------------------------------------------------------------------------------------		
		
		
		
	}
}
