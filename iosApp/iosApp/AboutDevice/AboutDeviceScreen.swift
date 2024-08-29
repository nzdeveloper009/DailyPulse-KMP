
import SwiftUI

struct AboutDeviceScreen: View {
    var body: some View {
        NavigationStack {
            AboutDeviceListView()
                .navigationTitle("About Device")
        }
    }
}

#Preview {
    AboutDeviceScreen()
}