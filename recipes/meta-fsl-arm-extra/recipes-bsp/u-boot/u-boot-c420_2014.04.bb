# Copyright (C) 2015 WinSystems, Inc.

DESCRIPTION = "Bootloader for WinSystems, Inc. imx6dl-c420 platform"
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCBRANCH = "imx_v2014.04_3.14.28_1.0.0_ga"
SRC_URI = "git://git.freescale.com/imx/uboot-imx.git;protocol=git;branch=${SRCBRANCH} \
           file://0001-imx6dlc420-Add-board-files.patch \
"
SRCREV = "88123ea911e133724cbe738c2b0517fa470592c0"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(imx6dlc420)"
