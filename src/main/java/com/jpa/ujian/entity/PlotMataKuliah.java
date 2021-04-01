package com.jpa.ujian.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="plotMataKuliah")
public class PlotMataKuliah {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id_plotMK;
	
	
	@ManyToMany (cascade = CascadeType.ALL)
	@JoinTable (joinColumns = {
			@JoinColumn(name= "PlotMK", referencedColumnName = "id_plotMK")},
	
			inverseJoinColumns = {
			@JoinColumn (name = "Dosen_id", referencedColumnName = "id_dosen"
					 )})
	private List<Dosen> lstdosen = new ArrayList<Dosen>();
	
	@ManyToMany (cascade = CascadeType.ALL)
	@JoinTable (joinColumns = {
			@JoinColumn(name= "PlotMK", referencedColumnName = "id_plotMK")},
	
			inverseJoinColumns = {
			@JoinColumn (name = "NIM_id", referencedColumnName = "id_nim"
					 )})
	private List<Mahasiswa> lstmahasiswa = new ArrayList<Mahasiswa>();
	
	@ManyToMany (cascade = CascadeType.ALL)
	@JoinTable (joinColumns = {
			@JoinColumn(name= "PlotMK", referencedColumnName = "id_plotMK")},
	
			inverseJoinColumns = {
			@JoinColumn (name = "MataKuliah_id", referencedColumnName = "id_matakuliah"
					 )})
	private List<MataKuliah> lstmatakuliah = new ArrayList<MataKuliah>();
	
	
}
