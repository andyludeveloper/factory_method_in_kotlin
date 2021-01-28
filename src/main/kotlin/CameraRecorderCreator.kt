class CameraRecorderCreator : AbstractCameraRecorderCreator() {
    private lateinit var cameraRecorder: ICameraRecorder

    fun record() {
        cameraRecorder = createCameraRecorder()
        cameraRecorder.start()
    }

    override fun createCameraRecorder() = CameraRecorder()
}