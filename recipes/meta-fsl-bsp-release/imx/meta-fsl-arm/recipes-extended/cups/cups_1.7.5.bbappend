# As it can not overwrite the version in the layer meta-fsl-arm, we have to use
#   another file extension for new patch to the append in the meta-fsl-arm

FILESEXTRAPATHS_prepend := "${THISDIR}:"

SRC_URI_append = " \
    file://rastertoc56 \
    file://libC56Tb.so.1.0 \
    file://libC56Api.so.1.0 \
    file://hengstlerc56.ppd \
"

do_install_append() {
    install -m 0755 ${WORKDIR}/rastertoc56 ${D}${libdir}/cups/filter/rastertoc56
    install -m 0777 ${WORKDIR}/libC56Tb.so.1.0 ${D}${libdir}/libC56Tb.so.1.0
    ln -sf libC56Tb.so.1.0 ${D}${libdir}/libC56Tb.so
    ln -sf libC56Tb.so.1.0 ${D}${libdir}/libC56Tb.so.1
    install -m 0777 ${WORKDIR}/libC56Api.so.1.0 ${D}${libdir}/libC56Api.so.1.0
    ln -sf libC56Api.so.1.0 ${D}${libdir}/libC56Api.so
    ln -sf libC56Api.so.1.0 ${D}${libdir}/libC56Api.so.1
    mkdir ${D}${datadir}/cups/model/Hengstler
    install -m 0755 ${WORKDIR}/hengstlerc56.ppd ${D}${datadir}/cups/model/Hengstler/hengstlerc56.ppd
}
