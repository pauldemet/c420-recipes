# Copyright (C) 2016 WinSystems, Inc.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by WinSYstems"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_3.14.28_1.0.0_ga"
LOCALVERSION = "-1.0.0_ga"
SRCREV = "91cf351a2afc17ac4a260e4d2ad1e32d00925a1b"

SRC_URI = "git://git.freescale.com/imx/linux-2.6-imx.git;protocol=git;branch=${SRCBRANCH} \
           file://0001-imx6dl-c420-Add-device-tree.patch \
           file://0002-imx6dl-c420-Add-gpio-panel-select-support.patch \
           file://0003-imx6dl-c420-Add-rs422-rs485-support.patch \
           file://defconfig \
"

DEFAULT_PREFERENCE = "1"

COMPATIBLE_MACHINE = "(mx6)"
COMPATIBLE_MACHINE = "(imx6dlc420)"
