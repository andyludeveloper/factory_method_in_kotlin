class CameraRecorderCreator : AbstractCameraRecorderCreator() {


    fun record() {
        cameraRecorder = createCameraRecorder()
        cameraRecorder.start()
    }

    override fun createCameraRecorder() = CameraRecorder()
}