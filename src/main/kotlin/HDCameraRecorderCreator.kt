class HDCameraRecorderCreator : AbstractCameraRecorderCreator() {
    fun record() {
        cameraRecorder = createCameraRecorder()
        cameraRecorder.start()
    }

    override fun createCameraRecorder() = HDCameraRecorder()
}