--tạo csddl
create database quanLiSanPham
--dùng database
use quanLiSanPham

create table  SanPham
(
	MaSP nchar(4) NOT NULL primary key,
	TenSP nchar(100),
	Gia int,
	MaLoaiSP nchar(5)
	
)
create table LoaiSanPham
(
	MaLoaiSP nchar(5) NOT NULL primary key,
	TenLoaiSP nchar(100)
)

insert into sanpham values('BC01','But chi',3000,'1BC01')
insert into sanpham values('BC02','But bi',4000,'2BC01')

insert into LoaiSanPham values('1BC01','Loai 1')
insert into LoaiSanPham values('2BC01','Loai 2')

-- insert into sanpham values('BC03','Thuoc ke',5000,'3BC01')
-- insert into LoaiSanPham values('3BC01','Loai 2')

-- select MaSP, TenSP, Gia, TenLoaiSP from SanPham, LoaiSanPham where SanPham.MaLoaiSP = LoaiSanPham.MaLoaiSP where MaLoaiSP = 

-- select MaSP, TenSP, Gia, TenLoaiSP from SanPham, LoaiSanPham where SanPham.MaLoaiSP = LoaiSanPham.MaLoaiSP
select * from SanPham
