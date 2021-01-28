abstract class AbstractCameraRecorderCreator {
    private lateinit var cameraRecorder: ICameraRecorder
    protected abstract fun createCameraRecorder(): ICameraRecorder

    protected open fun record() {
        cameraRecorder = createCameraRecorder()
        cameraRecorder.start()
    }
}