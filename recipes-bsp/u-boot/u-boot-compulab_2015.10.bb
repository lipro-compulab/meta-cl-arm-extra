require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "U-boot which includes support for CompuLab cl-som-imx6ul boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://configs/cl_som_imx6ul_defconfig;md5=1bace9f05f6bef7935f30ef50e9afa6f"

PROVIDES += "u-boot"

SRCBRANCH = "cl-som-imx6ul-2015.10"
SRCREV = "7361d8720df9559756697b7aa3048319859ef88c"
SRC_URI = "git://github.com/lipro-compulab/cl-som-imx6ul-u-boot.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

do_compile_append () {
	oe_runmake u-boot-with-spl-cl.imx
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "cl-som-imx6ul"
