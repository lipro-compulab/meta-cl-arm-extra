require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "CompuLab 3.14.38 kernel"
DESCRIPTION = "Linux kernel for CompuLab cl-som-imx6ul boards."

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "cl-som-imx6ul-imx_3.14.38_6ul_ga"
SRCREV = "b665490cc461e150b6f305aed3574a7c3480a686"
LOCALVERSION = "-imx6ul-cl-som-imx6ul"

SRC_URI = "git://github.com/lipro-compulab/cl-som-imx6ul-kernel.git;branch=${SRCBRANCH} \
           file://defconfig \
"

COMPATIBLE_MACHINE = "(cl-som-imx6ul)"
